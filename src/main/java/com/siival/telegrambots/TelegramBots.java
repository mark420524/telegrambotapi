package com.siival.telegrambots;

import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.BaseResponse;
/**
 * @author mark acrossxwall@gmail.com
 * @description bot interface
 * @date 2022/1/13 22:00
 * @version  1.0.0
 */
public interface TelegramBots<T extends BaseResponse> {

    T callMethod(MethodEnum method, Object params) throws  Exception  ;
}
