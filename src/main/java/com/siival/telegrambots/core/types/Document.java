package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Document {
    private String file_id;
    private String file_unique_id;
    private PhotoSize thumb;
    private String file_name;
    private String mime_type;
    private long file_size;

}
