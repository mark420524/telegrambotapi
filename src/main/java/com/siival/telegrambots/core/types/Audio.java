package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Audio {
    private String file_id;
    private String file_unique_id;
    private Integer duration;
    private String performer;
    private String title;
    private String file_name;
    private String mime_type;
    private long file_size;
    private PhotoSize thumb;
}
