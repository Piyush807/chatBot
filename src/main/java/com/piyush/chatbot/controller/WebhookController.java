package com.piyush.chatbot.controller;

import com.piyush.chatbot.model.MessageRequest;
import com.piyush.chatbot.model.MessageResponse;
import com.piyush.chatbot.service.ChatService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @Autowired
    private ChatService chatService;

    @PostMapping
    public MessageResponse receiveMessage(@RequestBody MessageRequest request) {

        logger.info("Incoming message: {}", request.getMessage());

        String reply = chatService.getReply(request.getMessage());

        logger.info("Reply sent: {}", reply);

        return new MessageResponse(reply);
    }
}
