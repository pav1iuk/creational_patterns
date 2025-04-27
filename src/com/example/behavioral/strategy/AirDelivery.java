package com.example.behavioral.strategy;

public class AirDelivery implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Доставка літаком.");
    }
}
