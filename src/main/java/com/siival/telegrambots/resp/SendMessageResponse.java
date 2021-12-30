package com.siival.telegrambots.resp;

import lombok.Data;

@Data
public class SendMessageResponse extends BaseResponse {

    private ResponseResult result;

    @Data
    private class ResponseResult {
        private Long message_id;
        private Long date;

    }
}
