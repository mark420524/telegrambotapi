package com.siival.telegrambots.core.factory;

import com.siival.telegrambots.core.method.GetMeMethod;
import com.siival.telegrambots.core.method.MethodInterface;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.GetMeResponse;

public class MethodFactory {

    public  static MethodInterface  getMethod(MethodEnum methodEnum) {
        MethodInterface methodInterface = null;
        switch (methodEnum){
            case GETME:
                methodInterface = new GetMeMethod() ;
                break;
            default:break;

        }
        return methodInterface ;
    }
}
