package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.util.HttpUtil;

import java.net.Proxy;

public abstract class AbstractMethod implements MethodInterface<BaseResponse>  {

    @Override
    public BaseResponse executeMethod(String url, boolean useProxy, Proxy proxy, Object params) throws Exception {
        String str = HttpUtil.postJson(url, params, useProxy, proxy);
        return buildResponse(str);
    }
}
