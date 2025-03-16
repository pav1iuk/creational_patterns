package com.example.creational;

import com.example.creational.singleton.BranchManager;
import com.example.creational.factory_method.Parcel;
import com.example.creational.factory_method.ParcelFactory;
import com.example.creational.builder.Order;
import com.example.creational.prototype.Shipment;
import com.example.creational.abstract_factory.*;

public class Main {
    public static void main(String[] args) {
        // Singleton
        BranchManager manager = BranchManager.getInstance();
        manager.addBranch("Київ-1");
        manager.showBranches();

        // Factory Method
        Parcel parcel = ParcelFactory.createParcel("small");
        parcel.deliver();

        // Builder
        Order order = new Order.Builder().setSender("Олексій").setReceiver("Марія").setParcelType("Документи").build();
        order.showOrder();

        // Prototype
        Shipment original = new Shipment("Посилка #12345");
        Shipment copy = original.clone();
        copy.showDetails();

        // Abstract Factory
        DeliveryFactory factory = new StandardDeliveryFactory();
        DeliveryService service = factory.createDelivery();
        service.send();
    }
}
