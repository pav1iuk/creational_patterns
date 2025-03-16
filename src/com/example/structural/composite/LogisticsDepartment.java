package com.example.structural.composite;

public class LogisticsDepartment implements Department {
    @Override
    public void showDetails() {
        System.out.println("Logistics department is managing shipments.");
    }
}
