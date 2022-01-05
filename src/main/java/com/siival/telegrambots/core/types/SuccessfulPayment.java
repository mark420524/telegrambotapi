package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class SuccessfulPayment {
    private String currency;
    private Integer total_amount;
    private String invoice_payload;
    private String shipping_option_id;
    private OrderInfo order_info;
    private String telegram_payment_charge_id;
    private String provider_payment_charge_id;
}
