package com.siival.telegrambots.req;

import com.siival.telegrambots.core.types.BotCommand;
import com.siival.telegrambots.core.types.BotCommandScope;
import lombok.Data;

import java.util.List;

@Data
public class SetCommandParams {

    private List<BotCommand> commands;

    private BotCommandScope scope;

    private String  language_code;
}
