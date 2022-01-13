package com.siival.telegrambots.core.method.impl;

import com.siival.telegrambots.core.method.AbstractMethod;
import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.BooleanResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetChatDescriptionMethod extends AbstractMethod {

    private Logger logger = LoggerFactory.getLogger(SetChatDescriptionMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("set chat description method 请求获取结果数据为:{}", resp);
        return JsonUtil.convertJsonToObject(resp, BooleanResponse.class);
    }
}
