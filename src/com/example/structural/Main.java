package com.example.structural;

import com.example.structural.adapter.NewTrackingSystem;
import com.example.structural.adapter.OldTrackingSystem;
import com.example.structural.adapter.TrackingAdapter;
import com.example.structural.bridge.Delivery;
import com.example.structural.bridge.ExpressService;
import com.example.structural.bridge.StandardDelivery;
import com.example.structural.composite.CourierDepartment;
import com.example.structural.composite.HeadOffice;
import com.example.structural.composite.LogisticsDepartment;
import com.example.structural.decorator.BasicParcel;
import com.example.structural.decorator.FragileParcelDecorator;
import com.example.structural.decorator.Parcel;
import com.example.structural.facade.ShippingFacade;
import com.example.structural.flyweight.ParcelFactory;
import com.example.structural.flyweight.ParcelType;
import com.example.structural.proxy.WarehouseAccess;
import com.example.structural.proxy.WarehouseProxy;

public class Main {
    public static void main(String[] args) {
        // Adapter
        OldTrackingSystem adapter = new TrackingAdapter(new NewTrackingSystem());
        adapter.trackParcel("NP12345");

        // Bridge
        Delivery delivery = new StandardDelivery(new ExpressService());
        delivery.processDelivery("NP54321");

        // Composite
        HeadOffice office = new HeadOffice();
        office.addDepartment(new CourierDepartment());
        office.addDepartment(new LogisticsDepartment());
        office.showDetails();

        // Decorator
        Parcel parcel = new FragileParcelDecorator(new BasicParcel());
        System.out.println(parcel.getDescription());

        // Facade
        ShippingFacade shipping = new ShippingFacade();
        shipping.shipParcel("NP77777");

        // Flyweight
        ParcelType type1 = ParcelFactory.getParcelType("Standard");
        ParcelType type2 = ParcelFactory.getParcelType("Standard");
        System.out.println("Are types shared? " + (type1 == type2));

        // Proxy
        WarehouseAccess access = new WarehouseProxy(false);
        access.accessWarehouse();
    }
}

