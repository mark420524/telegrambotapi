package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Sticker {

    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    private boolean is_animated;
    private PhotoSize thumb;
    private String emoji;
    private String set_name;
    private MaskPosition mask_position	;
    private long file_size;
}
