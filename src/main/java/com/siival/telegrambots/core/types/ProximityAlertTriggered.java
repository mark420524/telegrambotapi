package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class ProximityAlertTriggered {
    private User traveler;
    private User watcher;
    private Integer distance;
}
