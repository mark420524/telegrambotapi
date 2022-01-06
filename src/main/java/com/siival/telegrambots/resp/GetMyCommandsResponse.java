package com.siival.telegrambots.resp;

import com.siival.telegrambots.core.types.BotCommand;
import lombok.Data;

import java.util.List;

@Data
public class GetMyCommandsResponse extends BaseResponse {

    private List<BotCommand> result;
}
