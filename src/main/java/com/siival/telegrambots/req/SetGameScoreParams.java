package com.siival.telegrambots.req;

import lombok.Data;

@Data
public class SetGameScoreParams {

    private Long user_id;
    private Integer score;
    private boolean force;
    private boolean disable_edit_message;
    private Long chat_id;
    private Long message_id;
    private String inline_message_id;
}
