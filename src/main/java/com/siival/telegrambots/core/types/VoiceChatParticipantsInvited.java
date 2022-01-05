package com.siival.telegrambots.core.types;

import lombok.Data;

import java.util.List;

@Data
public class VoiceChatParticipantsInvited {

    private List<User> users;
}
