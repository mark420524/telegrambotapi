package com.siival.telegrambots.resp;

import com.siival.telegrambots.core.types.Message;
import lombok.Data;

@Data
public class SendMessageResponse extends BaseResponse {

    private Message result;

}
