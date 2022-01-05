package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class ChosenInlineResult {
    private String result_id;
    private User from;
    private Location location;
    private String inline_message_id;
    private String query;
}
