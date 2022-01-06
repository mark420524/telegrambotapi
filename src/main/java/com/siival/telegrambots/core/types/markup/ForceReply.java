package com.siival.telegrambots.core.types.markup;

import com.siival.telegrambots.core.types.abst.AbstractReplyMarkup;
import lombok.Data;

@Data
public class ForceReply extends AbstractReplyMarkup {

    private boolean force_reply = true;
    private String input_field_placeholder;
    private boolean selective;
}
