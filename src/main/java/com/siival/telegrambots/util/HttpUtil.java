package com.siival.telegrambots.util;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

public class HttpUtil {

	private static final Logger logger = LoggerFactory.getLogger(HttpUtil.class);
	public static final MediaType JSON
			= MediaType.parse("application/json; charset=utf-8");
	
	public static String get(String baseUrl, Map<String,Object> params) throws Exception {
		OkHttpClient client = createDefaultClient();
		HttpUrl.Builder  build = HttpUrl.parse(baseUrl).newBuilder();
		if (params!=null) {
			Iterator<Entry<String, Object>> it = params.entrySet().iterator();
			while ( it.hasNext()) {
				Entry<String, Object> entry = it.next();
				Object val = entry.getValue();
				if (val==null) {
					continue;
				}
				build.addQueryParameter(entry.getKey(), val.toString());
			}
		}
		HttpUrl url = build.build();
		Request request = new Request.Builder().url(url)
		.build();
		try {
			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) {
				return null;
			}
			String respStr = response.body().string();
			return respStr;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
	private static OkHttpClient createDefaultClient(){
		return createDefaultClient(5L,5l);
	}
	private static OkHttpClient createDefaultClient(long connectTimeout,long readTimeout) {
		OkHttpClient client = new OkHttpClient()
				.newBuilder()
				.connectTimeout(connectTimeout, TimeUnit.SECONDS)
				.readTimeout(readTimeout, TimeUnit.SECONDS)
				.build();
		return  client;
	}

	public static String createJsonParams(Map<String,Object> params) {
		if (params!=null) {
			ObjectMapper objectMapper = new ObjectMapper();
			try {
				return objectMapper.writeValueAsString(params);
			} catch (JsonProcessingException e) {
			}
		}
		return "{}";
	}

	public static String postJson(String baseUrl, Map<String,Object> params) throws Exception {
		OkHttpClient client = createDefaultClient();
		HttpUrl.Builder  build = HttpUrl.parse(baseUrl).newBuilder();
		RequestBody body = RequestBody.create(JSON, createJsonParams(params));
		HttpUrl url = build.build();
		Request request = new Request.Builder().url(url).post(body)
				.build();
		try {
			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) {
				return null;
			}
			String respStr = response.body().string();
			return respStr;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static String postForm(String baseUrl, Map<String,Object> params) throws Exception {
		OkHttpClient client = createDefaultClient();
		HttpUrl.Builder  build = HttpUrl.parse(baseUrl).newBuilder();
		HttpUrl url = build.build();
		MultipartBody.Builder
		  builder = new MultipartBody.Builder ().setType(MultipartBody.FORM);
		if (params!=null) {
			Iterator<Entry<String, Object>> it = params.entrySet().iterator();
			while ( it.hasNext()) {
				Entry<String, Object> entry = it.next();
				Object val = entry.getValue();
				if (val==null) {
					continue;
				}
				builder.addFormDataPart(entry.getKey(),val.toString());
			}
		}
		Request request = new Request.Builder().url(url).post(builder.build())
				.build();
		try {
			Response response = client.newCall(request).execute();
			if (!response.isSuccessful()) {
				return null;
			}
			String respStr = response.body().string();
			return respStr;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
