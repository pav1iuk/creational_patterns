package com.example.behavioral.memento;

public class PackageTracker {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveState() {
        return new Memento(state);
    }

    public void restoreState(Memento memento) {
        this.state = memento.getState();
    }
}
