package com.siival.telegrambots.enums;

public enum MethodEnum {

    GETME("getMe"),
    SENDMESSAGE("sendMessage")
    ;
    String methodName;
    MethodEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}
