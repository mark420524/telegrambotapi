package com.siival.telegrambots.req;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.siival.telegrambots.core.types.abst.AbstractReplyMarkup;
import lombok.Data;

import java.util.List;

@Data
public class SendPollParams {

    private String chat_id;
    private String question;
    private List<String> options;
    @JsonProperty("is_anonymous")
    private boolean  anonymous;
    private String type;
    private boolean allows_multiple_answers;
    private Integer  correct_option_id;
    private String explanation;
    private String explanation_parse_mode;
    private Integer open_period;
    private Integer close_date;
    @JsonProperty("is_closed")
    private boolean closed;
    private boolean disable_notification;
    private boolean protect_content;
    private Long reply_to_message_id;
    private boolean allow_sending_without_reply;
    private AbstractReplyMarkup reply_markup;


}
