package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.GetWebhookResponse;
import com.siival.telegrambots.util.HttpUtil;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Proxy;
import java.util.Map;

public class GetWebhookInfoMethod implements MethodInterface<BaseResponse> {

    private Logger logger = LoggerFactory.getLogger(GetWebhookInfoMethod.class);
    @Override
    public BaseResponse executeMethod(String url, boolean useProxy, Proxy proxy, Map<String, Object> params) throws Exception {
        String str = HttpUtil.get(url, params, useProxy, proxy);
        logger.info("getWebhookInfo 请求获取结果数据为:{}",str);
        return JsonUtil.convertJsonToObject(str, GetWebhookResponse.class);
    }
}
