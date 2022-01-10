package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.SendMessageResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SetGameScoreMethod extends AbstractMethod {

    private Logger logger = LoggerFactory.getLogger(SetGameScoreMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("setGameScore 请求获取结果数据为:{}", resp);
        return JsonUtil.convertJsonToObject(resp, SendMessageResponse.class);
    }
}
