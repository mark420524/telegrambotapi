package com.siival.telegrambots;

import com.siival.telegrambots.core.DefaultBots;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.*;
import com.siival.telegrambots.util.JsonUtil;

import java.util.HashMap;
import java.util.Map;

public class BotTest {

    public static void main(String[] args) {

        TelegramBots<DeleteWebhookResponse> t = new DefaultBots("", true);
        try {
            Map<String,Object> params = new HashMap<>();
//            params.put("chat_id", "");
//            params.put("text", "test");
            DeleteWebhookResponse r = t.callMethod(MethodEnum.DELETEWEBHOOK, params);
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }
}
