package com.example.structural.bridge;

public class StandardDelivery extends Delivery {
    public StandardDelivery(DeliveryService service) {
        super(service);
    }

    @Override
    public void processDelivery(String parcelId) {
        service.deliverParcel(parcelId);
    }
}
