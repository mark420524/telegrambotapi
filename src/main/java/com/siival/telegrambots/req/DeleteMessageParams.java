package com.siival.telegrambots.req;

import lombok.Data;


@Data
public class DeleteMessageParams {
    private	String	chat_id	;

    private Long message_id;
}
