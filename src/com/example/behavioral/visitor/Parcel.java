package com.example.behavioral.visitor;

public class Parcel implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
