package com.example.stompdemo.model;

public class Message {
    private String name;
    private String content;

    public Message(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String content) {
        this.name = name;
    }
}
