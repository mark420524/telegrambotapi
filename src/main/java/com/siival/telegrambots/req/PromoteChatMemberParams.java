package com.siival.telegrambots.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PromoteChatMemberParams {

    private String chat_id;
    private Long user_id;
    @JsonProperty("is_anonymous")
    private boolean anonymous;

    private boolean can_manage_chat;
    private boolean can_post_messages;
    private boolean can_edit_messages;
    private boolean can_delete_messages;
    private boolean can_manage_voice_chats;
    private boolean can_restrict_members;
    private boolean can_promote_members;
    private boolean can_change_info;
    private boolean can_invite_users;
    private boolean can_pin_messages;
}
