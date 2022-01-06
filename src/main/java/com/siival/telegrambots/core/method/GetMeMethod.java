package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.GetMeResponse;
import com.siival.telegrambots.util.HttpUtil;
import com.siival.telegrambots.util.JsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.Proxy;

public class GetMeMethod  implements MethodInterface<BaseResponse> {

    private Logger logger = LoggerFactory.getLogger(GetMeMethod.class);
    @Override
    public BaseResponse executeMethod(String url, boolean useProxy, Proxy proxy, Object params) throws  Exception {
        String str = HttpUtil.get(url, null, useProxy, proxy);
        logger.info("getMe 请求获取结果数据为:{}",str);
        return JsonUtil.convertJsonToObject(str, GetMeResponse.class);
    }
}
