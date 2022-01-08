package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.BooleanResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BanChatMemberMethod extends AbstractMethod   {

    private Logger logger = LoggerFactory.getLogger(BanChatMemberMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("ban chat member resp:{}", resp);
        return JsonUtil.convertJsonToObject(resp, BooleanResponse.class);
    }
}
