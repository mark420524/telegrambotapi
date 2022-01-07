package com.siival.telegrambots.enums;

public enum MethodEnum {

    GETME("getMe"),
    SENDMESSAGE("sendMessage"),
    GETWEBHOOKINFO("getWebhookInfo"),
    DELETEWEBHOOK("deleteWebhook"),
    GETMYCOMMANDS("getMyCommands"),
    SETMYCOMMANDS("setMyCommands"),
    SETWEBHOOK("setWebhook")
    ;
    String methodName;
    MethodEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}
