package com.siival.telegrambots.enums;

public enum BotCommandScopeEnum {
    Default("default"),
    AllPrivateChats("all_private_chats"),
    AllGroupChats("all_group_chats"),
    AllChatAdministrators("all_chat_administrators"),
    Chat("chat"),
    ChatAdministrators("chat_administrators"),
    ChatMember("chat_member")
    ;
    String type;
    BotCommandScopeEnum(String type){
        this.type= type;
    }

    public String getType() {
        return type;
    }
}
