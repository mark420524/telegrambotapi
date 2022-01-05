package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class User {

    private Long id;
    private boolean is_bot;
    private String first_name;
    private String last_name;
    private String username;
    private String language_code;
    private boolean can_join_groups;
    private boolean can_read_all_group_messages;
    private boolean supports_inline_queries;
}
