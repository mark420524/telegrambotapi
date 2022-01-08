package com.siival.telegrambots.enums;

public enum MethodEnum {

    GETME("getMe"),
    SENDMESSAGE("sendMessage"),
    GETWEBHOOKINFO("getWebhookInfo"),
    DELETEWEBHOOK("deleteWebhook"),
    GETMYCOMMANDS("getMyCommands"),
    SETMYCOMMANDS("setMyCommands"),
    SETWEBHOOK("setWebhook"),
    DELETEMESSAGE("deleteMessage"),
    BANCHATMEMBER("banChatMember"),
    UNBANCHATMEMBER("unbanChatMember")
    ;
    String methodName;
    MethodEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}
