package com.ffx.todo.api.entity;

/**
 * Created by Charith on 8/28/2016.
 */
public class ToDo {
    private Person owner;
    private String message;
    private Status status;

    public ToDo() {}

    public ToDo(Person owner, String message) {
        this.owner = owner;
        this.message = message;
        this.status = Status.CREATED;
    }

    public ToDo(Person owner, String message, Status status) {
        this.owner = owner;
        this.message = message;
        this.status = status;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
