package com.example.behavioral.strategy;

public class DeliveryService {
    private DeliveryStrategy strategy;

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void deliverPackage() {
        strategy.deliver();
    }
}
