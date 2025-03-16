package com.example.structural.proxy;

public class RealWarehouse implements WarehouseAccess {
    @Override
    public void accessWarehouse() {
        System.out.println("Accessing real warehouse");
    }
}
