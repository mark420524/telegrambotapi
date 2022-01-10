package com.siival.telegrambots.core.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ChatInviteLink {
    private String invite_link;
    private User creator;
    private boolean creates_join_request;
    @JsonProperty("is_primary")
    private boolean  primary;
    @JsonProperty("is_revoked")
    private boolean revoked;
    private String name;
    private long expire_date;
    private Integer member_limit;
    private Integer pending_join_request_count;
}
