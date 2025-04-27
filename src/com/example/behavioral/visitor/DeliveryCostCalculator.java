package com.example.behavioral.visitor;

public class DeliveryCostCalculator implements Visitor {
    @Override
    public void visit(Parcel parcel) {
        double cost = parcel.getWeight() * 12;
        System.out.println("Вартість посилки: " + cost + " грн");
    }

    @Override
    public void visit(Letter letter) {
        int cost = letter.isUrgent() ? 20 : 10;
        System.out.println("Вартість листа: " + cost + " грн");
    }
}
