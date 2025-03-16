package com.example.structural.facade;

import com.example.structural.adapter.NewTrackingSystem;
import com.example.structural.adapter.TrackingAdapter;
import com.example.structural.bridge.Delivery;
import com.example.structural.bridge.ExpressService;
import com.example.structural.bridge.StandardDelivery;

public class ShippingFacade {
    private TrackingAdapter tracker;
    private Delivery delivery;

    public ShippingFacade() {
        this.tracker = new TrackingAdapter(new NewTrackingSystem());
        this.delivery = new StandardDelivery(new ExpressService());
    }

    public void shipParcel(String trackingNumber) {
        tracker.trackParcel(trackingNumber);
        delivery.processDelivery(trackingNumber);
    }
}
