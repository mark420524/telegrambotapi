package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class OrderInfo {
    private String name;
    private String phone_number;
    private String email;
    private ShippingAddress shipping_address;
}
