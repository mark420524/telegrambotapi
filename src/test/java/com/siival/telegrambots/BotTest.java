package com.siival.telegrambots;

import com.siival.telegrambots.core.DefaultBots;
import com.siival.telegrambots.core.types.BotCommand;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.enums.TextFormattingEnum;
import com.siival.telegrambots.req.SendMessageParams;
import com.siival.telegrambots.req.SetCommandParams;
import com.siival.telegrambots.req.SetWebhookParams;
import com.siival.telegrambots.resp.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BotTest {

    private static final String token = "";

    @Test
    public  void testSetCommands() {
        TelegramBots<BooleanResponse> t = new DefaultBots(token, true);
        try {
            SetCommandParams params = new SetCommandParams();
            List<BotCommand> list = new ArrayList<>();
            BotCommand command = new BotCommand();
            command.setCommand("chatwithme");
            command.setDescription("you can send a message to me");
            list.add(command);
            BotCommand command1 = new BotCommand();
            command1.setCommand("welcome");
            command1.setDescription("hi buddy, welcome to my bot");
            list.add(command1);
            BotCommand command2 = new BotCommand();
            command2.setCommand("help");
            command2.setDescription("this is a help message");
            list.add(command2);
            BotCommand command3 = new BotCommand();
            command3.setCommand("justgo");
            command3.setDescription("hi buddy, just go go go");
            list.add(command3);
            params.setCommands(list);
            BooleanResponse r = t.callMethod(MethodEnum.SETMYCOMMANDS, params);
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public   void testGetCommands() {
        TelegramBots<GetMyCommandsResponse> t = new DefaultBots(token, true);
        try {
            Object params = null;
            GetMyCommandsResponse r = t.callMethod(MethodEnum.GETMYCOMMANDS, params);
            System.out.println(r);
        }catch (Exception e){

        }
    }


    @Test
    public void testSetWebHook() {
        TelegramBots<BooleanResponse> t = new DefaultBots(token, true);
        try {
            SetWebhookParams params = new SetWebhookParams();
            params.setUrl(String.format("https://chat.siival.com/webhook/%s",token ));
            BooleanResponse r = t.callMethod(MethodEnum.SETWEBHOOK, params);
            System.out.println(r);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testGetWebHook() {
        TelegramBots<GetWebhookResponse> t = new DefaultBots(token, true);
        try {
            Object params = null;
            GetWebhookResponse r = t.callMethod(MethodEnum.GETWEBHOOKINFO, params);
            System.out.println(r);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testSendMessage() {
        TelegramBots<SendMessageResponse> t = new DefaultBots(token, true);
        try {
            SendMessageParams params = new SendMessageParams();
            //use chat id
            params.setChat_id("");
            params.setText(
                    "*siival bot*\n" +
                    "_siival bot ,telgram bot api to build your bot _\n" +

                    "[see me](tg://user?id=5045304500)\n" +

                    "```java\n" +
                    "TelegramBots<BooleanResponse> t = new DefaultBots(token, true);\n" +
                            "try {\n" +
                            "    SetCommandParams params = new SetCommandParams();\n" +
                            "    BooleanResponse r = t.callMethod(MethodEnum.SETMYCOMMANDS, params);\n" +
                            "    System.out.println(r);\n" +
                            "} catch (Exception e) {\n" +
                            "    e.printStackTrace();\n" +
                            "}\n" +
                    "```" +
                    "查看更多使用方法请参考："+
                    "[telegrambotapi](https://github.com/mark420524/telegrambotapi.git)\n"

                    );
            params.setParse_mode(TextFormattingEnum.MarkdownV2.getName());
            params.setAllow_sending_without_reply(false);
            params.setDisable_web_page_preview(true);
            SendMessageResponse r = t.callMethod(MethodEnum.SENDMESSAGE, params);
            System.out.println(r);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
