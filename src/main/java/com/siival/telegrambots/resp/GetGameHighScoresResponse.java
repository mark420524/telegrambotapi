package com.siival.telegrambots.resp;

import com.siival.telegrambots.core.types.GameHighScore;
import lombok.Data;

import java.util.List;

@Data
public class GetGameHighScoresResponse extends BaseResponse {

    private List<GameHighScore> result;
}
