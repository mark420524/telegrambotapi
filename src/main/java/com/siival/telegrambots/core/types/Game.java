package com.siival.telegrambots.core.types;

import lombok.Data;

import java.util.List;

@Data
public class Game {
    private String title;
    private String description;
    private List<PhotoSize> photo;
    private String text;
    private List<MessageEntity> text_entities;
    private Animation animation;
}
