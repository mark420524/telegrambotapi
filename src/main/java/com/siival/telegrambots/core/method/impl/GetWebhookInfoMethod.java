package com.siival.telegrambots.core.method.impl;

import com.siival.telegrambots.core.method.AbstractMethod;
import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.GetWebhookResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetWebhookInfoMethod extends AbstractMethod {

    private Logger logger = LoggerFactory.getLogger(GetWebhookInfoMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("getWebhookInfo 请求获取结果数据为:{}", resp);
        return JsonUtil.convertJsonToObject(resp, GetWebhookResponse.class);
    }
}
