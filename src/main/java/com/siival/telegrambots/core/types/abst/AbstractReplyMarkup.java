package com.siival.telegrambots.core.types.abst;

import com.siival.telegrambots.core.types.markup.ForceReply;
import com.siival.telegrambots.core.types.markup.InlineKeyboardMarkup;
import com.siival.telegrambots.core.types.markup.ReplyKeyboardMarkup;
import com.siival.telegrambots.core.types.markup.ReplyKeyboardRemove;

public abstract class AbstractReplyMarkup {

    private AbstractReplyMarkup(){}


    public static InlineKeyboardMarkup buildInlineKeyboardMarkup() {
        return new InlineKeyboardMarkup();
    }

    public static ReplyKeyboardMarkup buildReplyKeyboardMarkup() {
        return new ReplyKeyboardMarkup();
    }

    public static ReplyKeyboardRemove buildReplyKeyboardRemove() {
        return new ReplyKeyboardRemove();
    }

    public static ForceReply buildForceReply() {
        return new ForceReply();
    }
}
