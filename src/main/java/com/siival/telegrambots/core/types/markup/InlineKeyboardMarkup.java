package com.siival.telegrambots.core.types.markup;

import com.siival.telegrambots.core.types.InlineKeyboardButton;
import com.siival.telegrambots.core.types.abst.AbstractReplyMarkup;
import lombok.Data;

import java.util.List;

@Data
public class InlineKeyboardMarkup extends AbstractReplyMarkup {

    private List<InlineKeyboardButton> inline_keyboard;
}
