package com.example.uibestpractice;

public class Msg {

    private String content;
    private int type;

    private static final int TYPE_RECEIVED = 0;
    private static final int TYPE_SENT = 1;

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public int getType() {
        return type;
    }
}
