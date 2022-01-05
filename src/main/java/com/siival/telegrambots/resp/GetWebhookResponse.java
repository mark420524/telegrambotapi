package com.siival.telegrambots.resp;

import com.siival.telegrambots.core.webhook.WebhookInfo;
import lombok.Data;

@Data
public class GetWebhookResponse  extends BaseResponse {
    private WebhookInfo result;
}
