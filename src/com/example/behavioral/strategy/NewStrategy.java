package com.example.behavioral.strategy;

import java.util.function.Consumer;

public class NewStrategy {
    private Runnable deliveryStrategy;

    public void setStrategy(Runnable strategy) {
        this.deliveryStrategy = strategy;
    }

    public void deliverPackage() {
        deliveryStrategy.run();
    }

    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        service.setStrategy(() -> System.out.println("Доставка літаком"));
        service.deliverPackage();

        service.setStrategy(() -> System.out.println("Доставка автомобілем"));
        service.deliverPackage();
    }
}
