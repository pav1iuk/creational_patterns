package com.example.structural.adapter;

public class TrackingAdapter implements OldTrackingSystem {
    private NewTrackingSystem newSystem;

    public TrackingAdapter(NewTrackingSystem newSystem) {
        this.newSystem = newSystem;
    }

    @Override
    public void trackParcel(String trackingNumber) {
        newSystem.newTrack(trackingNumber);
    }
}
