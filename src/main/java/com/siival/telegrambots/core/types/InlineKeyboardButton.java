package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class InlineKeyboardButton {

    private String text;
    private String user;
    private LoginUrl login_url;
    private String callback_data;
    private String switch_inline_query;
    private String switch_inline_query_current_chat;
    private CallbackGame callback_game;
    private boolean pay;
}
