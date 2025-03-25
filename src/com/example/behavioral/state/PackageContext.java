package com.example.behavioral.state;

public class PackageContext {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void showState() {
        System.out.println("Поточний статус: " + state);
    }
}
