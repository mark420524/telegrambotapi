package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.GetMeResponse;
import com.siival.telegrambots.resp.SendMessageResponse;
import com.siival.telegrambots.util.HttpUtil;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Proxy;
import java.util.Map;

public class SendMessageMethod implements MethodInterface<BaseResponse>  {

    private Logger logger = LoggerFactory.getLogger(SendMessageMethod.class);
    @Override
    public BaseResponse executeMethod(String url, boolean useProxy, Proxy proxy, Map<String, Object> params) throws Exception {
        String str = HttpUtil.postForm(url, params, useProxy, proxy);
        logger.info("sendMessage 请求获取结果数据为:{}",str);
        return JsonUtil.convertJsonToObject(str, SendMessageResponse.class);
    }
}
