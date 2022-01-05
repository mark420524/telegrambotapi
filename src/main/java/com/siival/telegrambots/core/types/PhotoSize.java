package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class PhotoSize {

    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    private long file_size;
}
