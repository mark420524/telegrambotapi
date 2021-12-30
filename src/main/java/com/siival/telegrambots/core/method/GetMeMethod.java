package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;

import java.net.Proxy;
import java.util.Map;

public class GetMeMethod  implements MethodInterface<BaseResponse> {
    @Override
    public BaseResponse executeMethod(String url, boolean useProxy, Proxy proxy, Map<String, Object> params) {
        return null;
    }
}
