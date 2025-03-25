package com.example.behavioral.template_method;

public class StandardDelivery extends DeliveryProcess {
    @Override
    void pack() { System.out.println("Стандартна упаковка."); }
    @Override
    void ship() { System.out.println("Доставка звичайним методом."); }
    @Override
    void deliverToClient() { System.out.println("Доставка клієнту."); }
}
