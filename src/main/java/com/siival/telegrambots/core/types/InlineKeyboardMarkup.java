package com.siival.telegrambots.core.types;

import lombok.Data;

import java.util.List;

@Data
public class InlineKeyboardMarkup {

    private List<List<InlineKeyboardButton>> inline_keyboard;
}
