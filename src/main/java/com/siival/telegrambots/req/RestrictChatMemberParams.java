package com.siival.telegrambots.req;

import com.siival.telegrambots.core.types.ChatPermissions;
import lombok.Data;

@Data
public class RestrictChatMemberParams {

    private String chat_id;
    private Long user_id;
    private ChatPermissions permissions;
    private Long until_date;
}
