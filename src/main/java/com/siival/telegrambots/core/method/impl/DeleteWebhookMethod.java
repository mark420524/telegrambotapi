package com.siival.telegrambots.core.method.impl;

import com.siival.telegrambots.core.method.AbstractMethod;
import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.DeleteWebhookResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DeleteWebhookMethod  extends AbstractMethod {

    private Logger logger = LoggerFactory.getLogger(DeleteWebhookMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("deleteWebhook 请求获取结果数据为:{}",resp);
        return JsonUtil.convertJsonToObject(resp, DeleteWebhookResponse.class);
    }
}
