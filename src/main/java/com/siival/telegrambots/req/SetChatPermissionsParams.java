package com.siival.telegrambots.req;

import com.siival.telegrambots.core.types.ChatPermissions;
import lombok.Data;

@Data
public class SetChatPermissionsParams {

    private String chat_id;
    private ChatPermissions permissions;
}
