package com.siival.telegrambots;

import com.siival.telegrambots.core.DefaultBots;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.GetMeResponse;
import com.siival.telegrambots.resp.SendMessageResponse;

import java.util.HashMap;
import java.util.Map;

public class BotTest {

    public static void main(String[] args) {

        TelegramBots<SendMessageResponse> t = new DefaultBots("", true);
        try {
            Map<String,Object> params = new HashMap<>();
            params.put("chat_id", "siivalbot");
            params.put("text", "test");
            SendMessageResponse r = t.callMethod(MethodEnum.SENDMESSAGE, params);
            System.out.println(r.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
