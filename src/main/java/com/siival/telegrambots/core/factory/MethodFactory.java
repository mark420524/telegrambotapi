package com.siival.telegrambots.core.factory;

import com.siival.telegrambots.core.method.*;
import com.siival.telegrambots.enums.MethodEnum;

public class MethodFactory {

    public  static MethodInterface  getMethod(MethodEnum methodEnum) {
        MethodInterface methodInterface = null;
        switch (methodEnum){
            case GETME:
                methodInterface = new GetMeMethod() ;
                break;
            case SENDMESSAGE:
                methodInterface = new SendMessageMethod();
                break;
            case GETWEBHOOKINFO:
                methodInterface = new GetWebhookInfoMethod();
                break;
            case DELETEWEBHOOK:
                methodInterface = new DeleteWebhookMethod();
                break;
            case GETMYCOMMANDS:
                methodInterface = new GetMyCommandsMethod();
                break;
            case SETMYCOMMANDS:
                methodInterface = new SetMyCommandsMethod();
                break;
            case SETWEBHOOK:
                methodInterface = new SetWebhookMethod();
                break;
            default:break;

        }
        return methodInterface ;
    }
}
