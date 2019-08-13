package com.example.stompdemo.controller;

import com.example.stompdemo.model.Greeting;
import com.example.stompdemo.model.HelloMessage;
import com.example.stompdemo.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import javax.swing.text.html.HTML;

@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Message greeting(Message message) throws Exception {
        // return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
        // return new Message("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
        // return new Message("Hello, " + HtmlUtils.htmlEscape(message) + "!");
        return new Message(message.getName(), message.getContent());
    }
}
/*
@Controller
public class GreetingController {
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message) throws Exception {
        Thread.sleep(500);
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
 */
