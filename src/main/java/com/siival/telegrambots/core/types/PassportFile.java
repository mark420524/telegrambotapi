package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class PassportFile {
    private String file_id;
    private String file_unique_id;
    private long file_size;
    private long file_date;
}
