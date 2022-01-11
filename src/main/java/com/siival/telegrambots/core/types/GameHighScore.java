package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class GameHighScore {

    private Integer position;
    private User user;
    private Integer score;
}
