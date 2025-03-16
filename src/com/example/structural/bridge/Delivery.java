package com.example.structural.bridge;

public abstract class Delivery {
    protected DeliveryService service;

    public Delivery(DeliveryService service) {
        this.service = service;
    }

    public abstract void processDelivery(String parcelId);
}
