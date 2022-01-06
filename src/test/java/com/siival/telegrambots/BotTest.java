package com.siival.telegrambots;

import com.siival.telegrambots.core.DefaultBots;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.*;

import java.util.HashMap;
import java.util.Map;

public class BotTest {

    public static void main(String[] args) {

        TelegramBots<GetMyCommandsResponse> t = new DefaultBots("", true);
        try {
            Map<String,Object> params = new HashMap<>();
//            params.put("chat_id", "");
//            params.put("text", "test");
            GetMyCommandsResponse r = t.callMethod(MethodEnum.GETMYCOMMANDS, params);
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("ok");
    }
}
