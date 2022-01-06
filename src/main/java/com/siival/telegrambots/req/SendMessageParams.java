package com.siival.telegrambots.req;

import com.siival.telegrambots.core.types.MessageEntity;
import com.siival.telegrambots.core.types.abst.AbstractReplyMarkup;
import lombok.Data;

import java.util.List;

@Data
public class SendMessageParams {
    private	String	chat_id	;
    private	String	text	;
    private	String	parse_mode	;
    private List<MessageEntity> entities	;
    private	boolean	disable_web_page_preview	;
    private	boolean	disable_notification	;
    private	boolean	protect_content	;
    private	Long	reply_to_message_id	;
    private	boolean	allow_sending_without_reply	;
//    InlineKeyboardMarkup or ReplyKeyboardMarkup or ReplyKeyboardRemove or ForceReply
    private AbstractReplyMarkup reply_markup ;



}
