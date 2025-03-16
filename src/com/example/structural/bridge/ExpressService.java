package com.example.structural.bridge;

public class ExpressService implements DeliveryService {
    @Override
    public void deliverParcel(String parcelId) {
        System.out.println("Express delivery for parcel: " + parcelId);
    }
}
