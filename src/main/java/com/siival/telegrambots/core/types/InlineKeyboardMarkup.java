package com.siival.telegrambots.core.types;

import lombok.Data;

import java.util.List;

@Data
public class InlineKeyboardMarkup {

    private List<InlineKeyboardButton> inline_keyboard;
}
