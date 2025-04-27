package com.example.behavioral.state;

public class DeliveryContext {
    private DeliveryState state;

    public void setState(DeliveryState state) {
        this.state = state;
    }

    public void request() {
        state.handle();
    }
}
