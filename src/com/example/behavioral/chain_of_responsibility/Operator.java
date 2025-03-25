package com.example.behavioral.chain_of_responsibility;

public class Operator implements Handler {
    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("simple question")) {
            System.out.println("Оператор відповідає на запитання.");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Запит не може бути оброблений.");
        }
    }
}
