package com.siival.telegrambots.enums;

public enum MethodEnum {

    GETME("getMe"),
    SENDMESSAGE("sendMessage"),
    GETWEBHOOKINFO("getWebhookInfo"),
    DELETEWEBHOOK("deleteWebhook"),
    GETMYCOMMANDS("getMyCommands"),
    SETMYCOMMANDS("setMyCommands"),
    DELETEMYCOMMANDS("deleteMyCommands"),
    SETWEBHOOK("setWebhook"),
    DELETEMESSAGE("deleteMessage"),
    BANCHATMEMBER("banChatMember"),
    UNBANCHATMEMBER("unbanChatMember"),
    SENDPOLL("sendPoll"),
    SETCHATTITLE("setChatTitle"),
    SETCHATDESCRIPTION("setChatDescription"),
    SETCHATPERMISSIONSMETHOD("setChatPermissions"),
    PINCHATMESSAGE("pinChatMessage"),
    UNPINCHATMESSAGE("unpinChatMessage"),
    UNPINALLCHATMESSAGE("unpinAllChatMessages"),
    RESTRICTCHATMEMBER("restrictChatMember"),
    PROMOTECHATMEMBER("promoteChatMember")
    ;
    String methodName;
    MethodEnum(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }
}
