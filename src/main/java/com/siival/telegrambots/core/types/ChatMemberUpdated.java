package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class ChatMemberUpdated {
    private Chat chat;
    private User from;
    private long date;
    private ChatMember old_chat_member;
    private ChatMember new_chat_member;
    private ChatInviteLink invite_link;
}
