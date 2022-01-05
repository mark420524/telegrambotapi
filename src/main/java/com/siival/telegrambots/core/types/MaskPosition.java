package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class MaskPosition {

    private String point;
    private double x_shift;
    private double y_shift;
    private double scale;
}
