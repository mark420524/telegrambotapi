package com.siival.telegrambots.req;

import lombok.Data;

@Data
public class UnBanChatMemberParams {

    private String chat_id;
    private Long user_id;
    //false remove from group , true only if banned
    private boolean only_if_banned;
}
