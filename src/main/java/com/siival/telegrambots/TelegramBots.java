package com.siival.telegrambots;

import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.BaseResponse;

import java.util.Map;

public interface TelegramBots<T extends BaseResponse> {

    T callMethod(MethodEnum method, Object params) throws  Exception  ;
}
