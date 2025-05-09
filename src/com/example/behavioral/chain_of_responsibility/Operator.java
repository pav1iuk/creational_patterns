package com.example.behavioral.chain_of_responsibility;

public class Operator implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler handler) {
        this.next = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.equals("track")) {
            System.out.println("Оператор надає інформацію про відстеження посилки.");
        } else if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("Ніхто не зміг обробити запит: " + request);
        }
    }
}
