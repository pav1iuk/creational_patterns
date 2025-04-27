package com.example.behavioral.memento;

public class PackageTracker {
    private String status;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public Memento save() {
        return new Memento(status);
    }

    public void restore(Memento memento) {
        this.status = memento.getState();
    }
}