package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.GetMeResponse;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class GetMeMethod  extends AbstractMethod   {

    private Logger logger = LoggerFactory.getLogger(GetMeMethod.class);

    @Override
    public BaseResponse buildResponse(String resp) throws Exception {
        logger.info("getMe 请求获取结果数据为:{}", resp);
        return JsonUtil.convertJsonToObject(resp, GetMeResponse.class);
    }
}
