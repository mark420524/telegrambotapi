package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class PollOption {
    private String text;
    private Integer voter_count;
}
