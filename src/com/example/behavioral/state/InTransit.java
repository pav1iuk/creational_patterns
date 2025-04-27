package com.example.behavioral.state;

public class InTransit implements DeliveryState {
    @Override
    public void handle() {
        System.out.println("Посилка в дорозі.");
    }
}
