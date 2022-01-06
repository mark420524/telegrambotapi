package com.siival.telegrambots.core.types.markup;

import com.siival.telegrambots.core.types.KeyboardButton;
import com.siival.telegrambots.core.types.abst.AbstractReplyMarkup;
import lombok.Data;

import java.util.List;

@Data
public class ReplyKeyboardMarkup extends AbstractReplyMarkup {

    private List<KeyboardButton> keyboard;

    private boolean resize_keyboard;
    private boolean one_time_keyboard;
    private String input_field_placeholder;
    private boolean selective;
}
