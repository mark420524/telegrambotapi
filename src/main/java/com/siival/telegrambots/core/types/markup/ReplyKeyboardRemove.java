package com.siival.telegrambots.core.types.markup;

import com.siival.telegrambots.core.types.abst.AbstractReplyMarkup;
import lombok.Data;

@Data
public class ReplyKeyboardRemove extends AbstractReplyMarkup {

    private boolean remove_keyboard = true;
    private boolean selective;
}
