package com.example.behavioral.chain_of_responsibility;

public class Director implements Handler {
    @Override
    public void setNext(Handler handler) {}

    @Override
    public void handleRequest(String request) {
        System.out.println("Директор розглядає складний запит: " + request);
    }
}
