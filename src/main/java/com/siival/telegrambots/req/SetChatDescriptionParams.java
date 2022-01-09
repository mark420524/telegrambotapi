package com.siival.telegrambots.req;

import lombok.Data;

@Data
public class SetChatDescriptionParams {

    private String chat_id;
    private String description;
}
