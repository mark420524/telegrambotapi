package com.siival.telegrambots.core.method;

import com.siival.telegrambots.resp.BaseResponse;
import com.siival.telegrambots.resp.GetMeResponse;
import com.siival.telegrambots.util.HttpUtil;
import com.siival.telegrambots.util.JsonUtil;

import java.net.Proxy;
import java.util.Map;

public class GetMeMethod  implements MethodInterface<BaseResponse> {
    @Override
    public BaseResponse executeMethod(String url, boolean useProxy, Proxy proxy, Map<String, Object> params) throws  Exception {
        String str = HttpUtil.get(url, params, useProxy, proxy);
        System.out.println(str);
        return JsonUtil.convertJsonToObject(str, GetMeResponse.class);
    }
}
