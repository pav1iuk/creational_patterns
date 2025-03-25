package com.example.behavioral.visitor;

public class Letter implements Visitable {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
