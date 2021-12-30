package com.siival.telegrambots.resp;

import lombok.Data;

@Data
public class GetMeResponse extends BaseResponse {

    private ResponseResult result;

    @Data
    private class ResponseResult {
        private Long id;
        private Boolean is_bot;
        private String first_name;
        private String username;
        private boolean  can_join_groups;
        private boolean can_read_all_group_messages;
        private boolean supports_inline_queries;
    }
}
