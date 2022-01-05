package com.siival.telegrambots;

import com.siival.telegrambots.core.DefaultBots;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.GetMeResponse;
import com.siival.telegrambots.resp.GetWebhookResponse;
import com.siival.telegrambots.resp.SendMessageResponse;
import com.siival.telegrambots.util.JsonUtil;

import java.util.HashMap;
import java.util.Map;

public class BotTest {

    public static void main(String[] args) {

        TelegramBots<GetWebhookResponse> t = new DefaultBots("", true);
        try {
            Map<String,Object> params = new HashMap<>();
//            params.put("chat_id", "");
//            params.put("text", "test");
            GetWebhookResponse r = t.callMethod(MethodEnum.GETWEBHOOKINFO, params);
            System.out.println(r.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
