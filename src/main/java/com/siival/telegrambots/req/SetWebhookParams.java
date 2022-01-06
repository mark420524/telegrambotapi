package com.siival.telegrambots.req;

import lombok.Data;

import java.io.File;
import java.util.List;

@Data
public class SetWebhookParams {

    private String url;
    private File certificate;
    private String ip_address;
    private Integer max_connections;
    private List<String> allowed_updates;
    private boolean drop_pending_updates;
}
