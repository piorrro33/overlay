package com.jcs.overlay.websocket.messages.J2W;

import java.util.Map;

@SuppressWarnings({"FieldCanBeLocal", "unused", "MismatchedQueryAndUpdateOfCollection"})
public class PlayerNamesMessage extends WebappMessage {
    private final Map<Integer, String> players;
    private final String messageType = "PlayerNames";

    public PlayerNamesMessage(Map<Integer, String> players) {
        this.players = players;
    }

    @Override
    public String getMessageType() {
        return this.messageType;
    }
}
