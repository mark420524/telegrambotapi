package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class PreCheckoutQuery {
    private String id;
    private User from;
    private String currency;
    private Integer total_amount;
    private String invoice_payload;
    private String shipping_option_id;
    private OrderInfo order_info;
}
