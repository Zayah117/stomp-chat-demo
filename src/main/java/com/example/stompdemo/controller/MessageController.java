package com.example.stompdemo.controller;

import com.example.stompdemo.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

// @Controller
public class MessageController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message message(Message message) throws Exception {
        // return new Message("Test name");
        return null;
    }
}
