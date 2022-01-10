package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Invoice {

    private String title;
    private String description;
    private String start_parameter;
    private String currency;
    private Integer total_amount;
}
