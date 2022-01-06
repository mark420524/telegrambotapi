package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class BotCommandScope {

    private String type;
    private String chat_id;
    private Long user_id;
}
