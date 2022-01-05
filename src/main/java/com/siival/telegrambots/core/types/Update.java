package com.siival.telegrambots.core.types;

import lombok.Data;

@Data
public class Update {

    private Long update_id;
    private Message message;
    private Message edited_message;
    private Message channel_post;
    private Message edited_channel_post;
    private InlineQuery inline_query;
    private ChosenInlineResult chosen_inline_result;
    private CallbackQuery callback_query;
    private ShippingQuery shipping_query;
    private	PreCheckoutQuery	pre_checkout_query;
    private	Poll	poll;
    private	PollAnswer	poll_answer;
    private	ChatMemberUpdated	my_chat_member;
    private	ChatMemberUpdated	chat_member;
    private	ChatJoinRequest	chat_join_request;

}
