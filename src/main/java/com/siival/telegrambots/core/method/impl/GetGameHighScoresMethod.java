package com.siival.telegrambots.core.method.impl;

import com.siival.telegrambots.core.method.AbstractMethod;
import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.GetGameHighScoresResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetGameHighScoresMethod extends AbstractMethod {
    private Logger logger = LoggerFactory.getLogger(GetGameHighScoresMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("get game high scores  请求获取结果数据为:{}", resp);
        return JsonUtil.convertJsonToObject(resp, GetGameHighScoresResponse.class);
    }
}
