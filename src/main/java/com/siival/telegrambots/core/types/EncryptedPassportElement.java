package com.siival.telegrambots.core.types;

import lombok.Data;

import java.util.List;

@Data
public class EncryptedPassportElement {

    private String type;
    private String data;
    private String phone_number;
    private String email;
    private List<PassportFile> files;
    private PassportFile front_side;
    private PassportFile reverse_side;
    private PassportFile selfie;
    private List<PassportFile> translation;
    private String hash;
}
