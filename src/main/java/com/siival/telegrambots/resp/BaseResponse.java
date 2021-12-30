package com.siival.telegrambots.resp;

import lombok.Data;

@Data
public class BaseResponse {

    private boolean ok;

    private String description;

    private Integer error_code;
}
