package com.siival.telegrambots;

import com.siival.telegrambots.resp.BaseResponse;

public interface TelegramBots<T extends BaseResponse> {

    T callMethod(String method) ;
}
