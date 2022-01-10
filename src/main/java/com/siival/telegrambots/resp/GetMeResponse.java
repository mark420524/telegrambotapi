package com.siival.telegrambots.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class GetMeResponse extends BaseResponse {

    private ResponseResult result;

    @Data
    private class ResponseResult {
        private Long id;
        @JsonProperty("is_bot")
        private boolean  bot;
        private String first_name;
        private String username;
        private boolean  can_join_groups;
        private boolean can_read_all_group_messages;
        private boolean supports_inline_queries;
    }
}
