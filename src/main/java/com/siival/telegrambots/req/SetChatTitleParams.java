package com.siival.telegrambots.req;

import lombok.Data;

@Data
public class SetChatTitleParams {

    private String chat_id;
    private String title;
}
