package com.example.behavioral.visitor;

public class Letter implements Visitable {
    private boolean isUrgent = true;

    public boolean isUrgent() {
        return isUrgent;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
