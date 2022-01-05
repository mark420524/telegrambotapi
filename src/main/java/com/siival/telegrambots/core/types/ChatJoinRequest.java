package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class ChatJoinRequest {

    private Chat chat;
    private User from;
    private long date;
    private String bio;
    private ChatInviteLink invite_link;
}
