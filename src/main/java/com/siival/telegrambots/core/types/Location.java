package com.siival.telegrambots.core.types;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Location {

    private BigDecimal longitude;
    private BigDecimal latitude;
    private float horizontal_accuracy;
    private Integer live_period;
    private Integer heading;
    private Integer proximity_alert_radius;
}
