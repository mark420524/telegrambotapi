package com.siival.telegrambots.req;

import lombok.Data;

@Data
public class PinChatMessageParams {

    private String chat_id;
    private Long message_id;
    private boolean disable_notification = true;
}
