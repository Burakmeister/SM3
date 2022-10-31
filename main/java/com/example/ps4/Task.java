package com.example.ps4;

import java.util.Date;
import java.util.UUID;

public class Task{
    private final UUID id;
    private String name;
    private final Date date;
    private boolean done;

    public Task(String name, boolean isDone){
        id = UUID.randomUUID();
        date = new Date();
        this.name = name;
        this.done = isDone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getDate() {
        return date;
    }

    public UUID getId() {
        return id;
    }
}