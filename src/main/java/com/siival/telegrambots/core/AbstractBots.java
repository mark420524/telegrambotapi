package com.siival.telegrambots.core;

import com.siival.telegrambots.TelegramBots;

import java.net.Proxy;

public abstract class AbstractBots  implements TelegramBots   {

    private   String url = "https://api.telegram.org/bot%s/%s";
    /**
     * 是否使用 proxy
     */
    protected boolean useProxy;
    private Proxy proxy;
    protected String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    public Proxy getProxy() {
        return proxy;
    }

    public void setProxy(Proxy proxy) {
        this.proxy = proxy;
    }

    public String getBotUrl() {
        return url;
    }

    public void setBotUrl(String url) {
        if (url!=null) {
            this.url = url;
        }

    }
}
