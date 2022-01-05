package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class EncryptedCredentials {
    private String data;
    private String hash;
    private String secret;
}
