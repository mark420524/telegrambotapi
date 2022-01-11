package com.siival.telegrambots.resp;

import com.siival.telegrambots.core.types.User;
import lombok.Data;

@Data
public class GetMeResponse extends BaseResponse {

    private User result;

}
