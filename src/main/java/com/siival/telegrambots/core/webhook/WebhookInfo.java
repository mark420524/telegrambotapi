package com.siival.telegrambots.core.webhook;

import lombok.Data;

import java.util.List;

@Data
public class WebhookInfo {
    private String url;
    private boolean has_custom_certificate;
    private Integer pending_update_count;
    private String ip_address;
    private Integer last_error_date;
    private String last_error_message;
    private Integer max_connections;
    private List<String> allowed_updates;
}
