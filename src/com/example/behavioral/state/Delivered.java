package com.example.behavioral.state;

public class Delivered implements DeliveryState {
    @Override
    public void handle() {
        System.out.println("Посилка доставлена.");
    }
}
