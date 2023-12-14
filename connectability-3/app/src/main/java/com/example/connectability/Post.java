package com.example.connectability;

public class Post {
    private String content;
    private String timestamp;

    public Post(String content, String timestamp) {
        this.content = content;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
