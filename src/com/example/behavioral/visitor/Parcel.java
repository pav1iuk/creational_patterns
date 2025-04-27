package com.example.behavioral.visitor;

public class Parcel implements Visitable {
    private double weight = 3.5;

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
