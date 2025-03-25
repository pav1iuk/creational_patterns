package com.example.behavioral.template_method;

public abstract class DeliveryProcess {
    public final void deliver() {
        pack();
        ship();
        deliverToClient();
    }

    abstract void pack();
    abstract void ship();
    abstract void deliverToClient();
}
