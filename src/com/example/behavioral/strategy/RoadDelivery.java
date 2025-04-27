package com.example.behavioral.strategy;

public class RoadDelivery implements DeliveryStrategy {
    @Override
    public void deliver() {
        System.out.println("Доставка автомобілем.");
    }
}
