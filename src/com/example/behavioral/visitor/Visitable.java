package com.example.behavioral.visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
