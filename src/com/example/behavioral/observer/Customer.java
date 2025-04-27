package com.example.behavioral.observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(String info) {
        System.out.println(name + " отримав повідомлення: " + info);
    }
}

