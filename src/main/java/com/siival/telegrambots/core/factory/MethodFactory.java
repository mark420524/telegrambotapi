package com.siival.telegrambots.core.factory;

import com.siival.telegrambots.core.method.*;
import com.siival.telegrambots.enums.MethodEnum;
import com.siival.telegrambots.resp.BaseResponse;

public class MethodFactory {

    public  static MethodInterface<BaseResponse>   getMethod(MethodEnum methodEnum) {
        MethodInterface<BaseResponse> methodInterface = null;
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
            case DELETEMESSAGE:
                methodInterface = new DeleteMessageMethod();
                break;
            case BANCHATMEMBER:
                methodInterface = new BanChatMemberMethod();
                break;
            case UNBANCHATMEMBER:
                methodInterface = new UnBanChatMemberMethod();
                break;
            case SENDPOLL:
                methodInterface = new SendPollMethod();
                break;
            case SETCHATTITLE:
                methodInterface = new SetChatTitleMethod();
                break;
            case SETCHATDESCRIPTION:
                methodInterface = new SetChatDescriptionMethod();
                break;
            case SETCHATPERMISSIONSMETHOD:
                methodInterface = new SetChatPermissionsMethod();
                break;
            case PINCHATMESSAGE:
                methodInterface = new PinChatMessageMethod();
                break;
            case UNPINCHATMESSAGE:
                methodInterface = new UnpinChatMessageMethod();
                break;
            case UNPINALLCHATMESSAGE:
                methodInterface = new UnpinAllChatMessagesMethod();
                break;
            case DELETEMYCOMMANDS:
                methodInterface = new DeleteMyCommandsMethod();
                break;
            case RESTRICTCHATMEMBER:
                methodInterface = new RestrictChatMemberMethod();
                break;
            case PROMOTECHATMEMBER:
                methodInterface = new PromoteChatMemberMethod();
                break;
            case SENDGAME:
                methodInterface = new SendGameMethod();
                break;
            case SETGAMESCORE:
                methodInterface = new SetGameScoreMethod();
                break;
            case GETGAMEHIGHSCCORES:
                methodInterface = new GetGameHighScoresMethod();
                break;
            case LEAVECHAT:
                methodInterface = new LeaveChatMethod();
                break;
            case GETCHAT:
                methodInterface = new GetChatMethod();
                break;
            default:break;

        }
        return methodInterface ;
    }
}
