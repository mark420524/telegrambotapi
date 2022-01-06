package com.siival.telegrambots.resp;

import lombok.Data;

@Data
public class BooleanResponse extends BaseResponse {
    private boolean result;
}
