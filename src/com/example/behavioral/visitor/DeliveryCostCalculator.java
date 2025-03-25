package com.example.behavioral.visitor;

public class DeliveryCostCalculator implements Visitor {
    @Override
    public void visit(Parcel parcel) {
        System.out.println("Розрахунок вартості доставки для посилки.");
    }

    @Override
    public void visit(Letter letter) {
        System.out.println("Розрахунок вартості доставки для листа.");
    }
}
