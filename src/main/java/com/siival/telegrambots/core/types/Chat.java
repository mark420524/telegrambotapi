package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Chat {

    private Long id;
    private String type;
    private String title;
    private String username;
    private String first_name;
    private String last_name;
    private ChatPhoto photo;
    private String bio;
    private boolean has_private_forwards;
    private String description;
    private String invite_link;
    private Message pinned_message;
    private ChatPermissions permissions;
    private Integer slow_mode_delay;
    private Integer message_auto_delete_time;
    private boolean has_protected_content;
    private String sticker_set_name;
    private boolean can_set_sticker_set;
    private Long linked_chat_id;
    private ChatLocation location;
}
