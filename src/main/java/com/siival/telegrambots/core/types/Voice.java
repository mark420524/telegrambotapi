package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Voice {
    private String file_id;
    private String file_unique_id;
    private Integer duration;
    private String mime_type;
    private long file_size;
}
