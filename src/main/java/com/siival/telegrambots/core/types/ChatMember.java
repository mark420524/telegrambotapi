package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class ChatMember {
    //owner start
    private String status;
    private User user;
    private boolean is_anonymous;
    private String custom_title;
    //owner end

    //administrator start
    private boolean can_be_edited;
    private boolean can_manage_chat;
    private boolean can_delete_messages;
    private boolean can_manage_voice_chats;
    private boolean can_restrict_members;
    private boolean can_promote_members;
    private boolean can_change_info;
    private boolean can_invite_users;
    private boolean can_post_messages;
    private boolean can_edit_messages;
    private boolean can_pin_messages;
    //administrator end

    //restrict start
    private boolean is_member;
    private boolean can_send_messages;
    private boolean can_send_media_messages;
    private boolean can_send_polls;
    private boolean can_send_other_messages;
    private boolean can_add_web_page_previews;
    private long until_date;
    //restrict end
}
