package com.siival.telegrambots.core.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Sticker {

    private String file_id;
    private String file_unique_id;
    private Integer width;
    private Integer height;
    @JsonProperty("is_animated")
    private boolean  animated;
    private PhotoSize thumb;
    private String emoji;
    private String set_name;
    private MaskPosition mask_position	;
    private long file_size;
}
