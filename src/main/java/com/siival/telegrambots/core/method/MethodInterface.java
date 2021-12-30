package com.siival.telegrambots.core.method;

import java.net.Proxy;
import java.util.Map;

public interface MethodInterface<T> {

    T executeMethod(String url, boolean useProxy, Proxy proxy, Map<String, Object> params );
}
