package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.BooleanResponse;
import com.siival.telegrambots.util.HttpUtil;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Proxy;

public class SetMyCommandsMethod implements MethodInterface<BaseResponse>{

    private Logger logger = LoggerFactory.getLogger(SetMyCommandsMethod.class);
    @Override
    public BaseResponse executeMethod(String url, boolean useProxy, Proxy proxy, Object params) throws Exception {
        String str = HttpUtil.postJson(url, params, useProxy, proxy);
        logger.info("set my commands 请求获取结果数据为:{}",str);
        return JsonUtil.convertJsonToObject(str, BooleanResponse.class);
    }
}
