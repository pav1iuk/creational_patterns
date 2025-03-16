package com.example.structural.proxy;

public class WarehouseProxy implements WarehouseAccess {
    private RealWarehouse realWarehouse;
    private boolean hasAccess;

    public WarehouseProxy(boolean hasAccess) {
        this.hasAccess = hasAccess;
    }

    @Override
    public void accessWarehouse() {
        if (hasAccess) {
            if (realWarehouse == null) {
                realWarehouse = new RealWarehouse();
            }
            realWarehouse.accessWarehouse();
        } else {
            System.out.println("Access denied to warehouse");
        }
    }
}
