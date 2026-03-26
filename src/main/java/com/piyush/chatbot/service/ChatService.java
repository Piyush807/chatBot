package com.piyush.chatbot.service;

import org.springframework.stereotype.Service;

@Service
public class ChatService {

    public String getReply(String msg) {

        if (msg == null) return "Invalid message";

        msg = msg.toLowerCase();

        if (msg.contains("hi") || msg.contains("hello")) {
            return "Hello";
        } else if (msg.contains("bye")) {
            return "Goodbye";
        } else if (msg.contains("how are you")) {
            return "I am fine, thanks!";
        } else {
            return "I didn't understand";
        }
    }
}
