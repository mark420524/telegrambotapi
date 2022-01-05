package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Contact {

    private String phone_number;
    private String first_name;
    private String last_name;
    private Long user_id;
    private String vcard;
}
