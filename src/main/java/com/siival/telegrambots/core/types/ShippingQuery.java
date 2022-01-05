package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class ShippingQuery {

    private String id;
    private User from;
    private String invoice_payload;
    private ShippingAddress shipping_address;
}
