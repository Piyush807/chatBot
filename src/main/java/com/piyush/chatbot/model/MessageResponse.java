package com.piyush.chatbot.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MessageResponse {

    private String reply;

    public MessageResponse(String reply) {
        this.reply = reply;
    }

}
