package com.example.creational.prototype;

public class Shipment implements Cloneable {
    private String details;

    public Shipment(String details) {
        this.details = details;
    }

    public void showDetails() {
        System.out.println("Деталі відправлення: " + details);
    }

    @Override
    public Shipment clone() {
        return new Shipment(this.details);
    }
}
