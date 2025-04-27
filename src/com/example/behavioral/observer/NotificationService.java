package com.example.behavioral.observer;
import java.util.*;

public class NotificationService {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String info) {
        for (Observer o : observers) {
            o.update(info);
        }
    }
}
