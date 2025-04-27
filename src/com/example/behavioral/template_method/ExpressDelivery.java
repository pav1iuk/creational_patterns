package com.example.behavioral.template_method;

public class ExpressDelivery extends DeliveryProcess {
    @Override
    protected void pack() {
        System.out.println("Термінова упаковка");
    }

    @Override
    protected void transport() {
        System.out.println("Швидка доставка");
    }

    @Override
    protected void deliverToCustomer() {
        System.out.println("Швидка передача клієнту");
    }
}
