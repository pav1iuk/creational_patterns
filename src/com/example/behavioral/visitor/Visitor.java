package com.example.behavioral.visitor;

public interface Visitor {
    void visit(Parcel parcel);
    void visit(Letter letter);
}
