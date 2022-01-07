package com.siival.telegrambots.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.siival.telegrambots.resp.SendMessageResponse;

public class JsonUtil {

    public static String createJsonParams(Object params) {
        if (params!=null) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            try {
                return objectMapper.writeValueAsString(params);
            } catch (JsonProcessingException e) {
            }
        }
        return "{}";
    }


    public static <T> T convertJsonToObject(String json,Class<T> clazz) {
        if (json==null) {
            return null;
        }
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            JsonNode respNode = objectMapper.readTree(json);
            return objectMapper.convertValue(respNode, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }


}
