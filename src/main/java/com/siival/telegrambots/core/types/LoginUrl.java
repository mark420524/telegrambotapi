package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class LoginUrl {
    private String url;
    private String forward_text;
    private String bot_username;
    private boolean request_write_access;
}
