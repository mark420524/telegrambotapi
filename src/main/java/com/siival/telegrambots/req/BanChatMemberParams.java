package com.siival.telegrambots.req;

import lombok.Data;

@Data
public class BanChatMemberParams {

    private String chat_id;
    private Long user_id;
    private Long until_date;
    private boolean revoke_messages;
}
