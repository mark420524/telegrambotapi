package com.siival.telegrambots.core.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Message {

    private Long message_id;
    private User from;
    private Chat sender_chat;
    private long date;
    private Chat chat;
    private User forward_from;
    private Chat forward_from_chat;
    private Long forward_from_message_id;
    private String forward_signature;
    private String forward_sender_name;
    private long forward_date;
    @JsonProperty("is_automatic_forward")
    private boolean automatic_forward;
    private Message reply_to_message;
    private User via_bot;
    private long edit_date;
    private boolean has_protected_content;
    private String media_group_id;
    private String author_signature;
    private String text;
    private List<MessageEntity> entities;
    private Animation animation;
    private Audio audio;
    private Document document;
    private List<PhotoSize> photo;
    private Sticker sticker;
    private Video video;
    private VideoNote video_note;
    private Voice voice;
    private String caption;
    private List<MessageEntity> caption_entities;
    private Contact contact;
    private Dice dice;
    private Game game;
    private Poll poll;
    private Venue venue;
    private Location location;
    private List<User> new_chat_members;
    private User left_chat_member;
    private String new_chat_title;
    private List<PhotoSize> new_chat_photo;
    private boolean delete_chat_photo;
    private boolean group_chat_created;
    private boolean supergroup_chat_created;
    private boolean channel_chat_created;
    private MessageAutoDeleteTimerChanged message_auto_delete_timer_changed;
    private Long migrate_to_chat_id;
    private Long migrate_from_chat_id;
    private Message pinned_message;
    private Invoice invoice;
    private SuccessfulPayment successful_payment;
    private String connected_website;
    private PassportData 	passport_data;
    private ProximityAlertTriggered proximity_alert_triggered;
    private VoiceChatScheduled voice_chat_scheduled;
    private VoiceChatStarted voice_chat_started;
    private VoiceChatEnded voice_chat_ended;
    private VoiceChatParticipantsInvited voice_chat_participants_invited;
    private InlineKeyboardMarkup reply_markup;
}
