package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Venue {
    private Location location;
    private String title;
    private String address;
    private String foursquare_id;
    private String foursquare_type;
    private String google_place_id;
    private String google_place_type;
}
