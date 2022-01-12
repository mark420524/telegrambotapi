package com.siival.telegrambots.resp;

import com.siival.telegrambots.core.types.Chat;
import lombok.Data;

@Data
public class GetChatResponse extends BaseResponse {

    private Chat result;
}
