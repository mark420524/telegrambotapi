package com.siival.telegrambots.core.method;

import java.net.Proxy;

public interface MethodInterface<T> {

    T executeMethod(String url, boolean useProxy, Proxy proxy, Object params ) throws  Exception ;

    T buildResponse(String resp) throws Exception;
}
