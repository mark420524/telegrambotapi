package com.siival.telegrambots.req;

import com.siival.telegrambots.core.types.BotCommandScope;
import lombok.Data;

@Data
public class DeleteMyCommandsParams {

    private BotCommandScope scope;
    private String language_code;
}
