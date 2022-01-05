package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class VideoNote {

    private String file_id;
    private String file_unique_id;
    private Integer length;

    private Integer duration;
    private PhotoSize thumb;

    private long file_size;
}
