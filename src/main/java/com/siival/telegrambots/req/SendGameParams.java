package com.siival.telegrambots.req;

import com.siival.telegrambots.core.types.markup.InlineKeyboardMarkup;
import lombok.Data;

@Data
public class SendGameParams {

    private Long chat_id;
    private String game_short_name;
    private boolean disable_notification;
    private boolean protect_content;
    private Long reply_to_message_id;
    private boolean allow_sending_without_reply;
    private InlineKeyboardMarkup reply_markup;
}
