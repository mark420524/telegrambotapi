package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class InlineQuery {
    private String id;
    private User from;
    private String query;
    private String offset;
    private String chat_type;
    private Location location;
}
