package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class MessageEntity {

    private String type;
    private Long offset;
    private Long length;
    private String url;
    private User user;
    private String language;
}
