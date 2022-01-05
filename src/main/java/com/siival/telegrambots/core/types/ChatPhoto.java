package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class ChatPhoto {

    private String small_file_id;
    private String small_file_unique_id;
    private String big_file_id;
    private String big_file_unique_id;
}
