package com.siival.telegrambots.core.factory;

import com.siival.telegrambots.core.method.GetMeMethod;
import com.siival.telegrambots.core.method.GetWebhookInfoMethod;
import com.siival.telegrambots.core.method.MethodInterface;
import com.siival.telegrambots.core.method.SendMessageMethod;
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
            default:break;

        }
        return methodInterface ;
    }
}
