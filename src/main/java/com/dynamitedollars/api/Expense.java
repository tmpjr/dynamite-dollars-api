package com.dynamitedollars.api;

public class Expense {
    private final long id;
    private final String content;

    public Expense(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.content;
    }
}
