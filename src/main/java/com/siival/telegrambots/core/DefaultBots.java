package com.siival.telegrambots.core;

import com.siival.telegrambots.core.factory.MethodFactory;
import com.siival.telegrambots.core.method.MethodInterface;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.BaseResponse;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Map;

public class DefaultBots  extends AbstractBots   {

    public DefaultBots(String token) {
        this.token = token;
    }

    public DefaultBots(String token, String url) {
        this(token, url, false, null);
    }

    public DefaultBots(String token, boolean useProxy) {
        this.token = token;
        this.useProxy = useProxy;
        if (useProxy) { super.setProxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 1080))); }
    }

    public DefaultBots(String token,String ip, int port) {
        this.token = token;
        this.useProxy = true;
        super.setProxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(ip, port)));
    }

    public DefaultBots(String token,String url,String ip, int port) {
        this(token, url, true, new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(ip, port)) );
    }

    public DefaultBots(String token, String url, boolean useProxy, Proxy proxy) {
        super.setBotUrl(url);
        this.token = token;
        if (useProxy) {
            this.useProxy = true;
            super.setProxy(proxy);
        }
    }


    @Override
    public BaseResponse callMethod(MethodEnum method, Map  params) throws  Exception {
        String methodName = method.getMethodName();
        String url = String.format(this.getBotUrl(), this.token, methodName);
        MethodInterface<BaseResponse> methodInterface = MethodFactory.getMethod(method);
        return methodInterface.executeMethod(url, this.useProxy, this.getProxy(), params);
    }
}
