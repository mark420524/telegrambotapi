package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.BooleanResponse;
import com.siival.telegrambots.resp.GetChatResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GetChatMethod extends AbstractMethod {

    private Logger logger = LoggerFactory.getLogger(GetChatMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("get chat  method 请求获取结果数据为:{}", resp);
        return JsonUtil.convertJsonToObject(resp, GetChatResponse.class);
    }
}
