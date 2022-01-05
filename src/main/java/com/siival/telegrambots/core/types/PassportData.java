package com.siival.telegrambots.core.types;

import lombok.Data;

import java.util.List;

@Data
public class PassportData {

    private List<EncryptedPassportElement> data;
    private EncryptedCredentials credentials;
}
