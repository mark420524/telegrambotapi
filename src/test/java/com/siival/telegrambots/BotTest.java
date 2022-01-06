package com.siival.telegrambots;

import com.siival.telegrambots.core.DefaultBots;
import com.siival.telegrambots.core.types.BotCommand;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.req.SetCommandParams;
import com.siival.telegrambots.resp.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BotTest {

    private static final String token = "";

    private static void setCommands() {
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

    public static void getCommands() {
        TelegramBots<GetMyCommandsResponse> t = new DefaultBots(token, true);
        try {
            Object params = null;
            GetMyCommandsResponse r = t.callMethod(MethodEnum.GETMYCOMMANDS, params);
            System.out.println(r);
        }catch (Exception e){

        }
    }



    public static void main(String[] args) {

        getCommands();
    }
}
