package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class KeyboardButton {

    private String text;
    private boolean request_contact;
    private boolean request_location;
    private KeyboardButtonPollType request_poll;
}
