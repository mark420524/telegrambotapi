package com.siival.telegrambots.core;

import com.siival.telegrambots.resp.BaseResponse;

import java.net.InetSocketAddress;
import java.net.Proxy;

public class DefaultBots<T extends BaseResponse> extends AbstractBots  {

    public DefaultBots() {
    }

    public DefaultBots(String url) {
        this(url, false, null);
    }

    public DefaultBots(boolean useProxy) {
        if (useProxy) { super.setProxy(new Proxy(Proxy.Type.SOCKS, new InetSocketAddress("127.0.0.1", 1080))); }
    }

    public DefaultBots(String url,String ip, int port) {
        this(url, true, new Proxy(Proxy.Type.SOCKS, new InetSocketAddress(ip, port)) );
    }

    public DefaultBots(String url, boolean useProxy, Proxy proxy) {
        super.setBotUrl(url);
        if (useProxy) {
            this.useProxy = true;
            super.setProxy(proxy);
        }
    }

    @Override
    public T callMethod(String method) {
        return null;
    }
}
