package com.siival.telegrambots;

import com.siival.telegrambots.core.DefaultBots;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.GetMeResponse;

public class BotTest {

    public static void main(String[] args) {

        TelegramBots<GetMeResponse> t = new DefaultBots("", true);
        try {
            GetMeResponse r = t.callMethod(MethodEnum.GETME);
            System.out.println(r.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
