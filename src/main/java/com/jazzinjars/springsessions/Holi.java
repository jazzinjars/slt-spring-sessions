package com.jazzinjars.springsessions;

public class Holi {

    private final long id;
    private final String content;

    public Holi(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
