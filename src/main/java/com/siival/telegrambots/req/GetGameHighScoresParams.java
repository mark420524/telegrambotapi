package com.siival.telegrambots.req;

import lombok.Data;

@Data
public class GetGameHighScoresParams {

    private Long user_id;
    private Long chat_id;
    private Long message_id;
    private String inline_message_id;
}
