package com.example.behavioral.observer;

import java.util.*;

public class PostOffice {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String status) {
        for (Observer o : observers) {
            o.update(status);
        }
    }
}
