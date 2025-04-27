package com.example.behavioral.template_method;

public abstract class DeliveryProcess {
    public final void deliver() {
        pack();
        transport();
        deliverToCustomer();
    }

    protected abstract void pack();
    protected abstract void transport();
    protected abstract void deliverToCustomer();
}
