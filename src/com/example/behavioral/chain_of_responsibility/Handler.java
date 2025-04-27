package com.example.behavioral.chain_of_responsibility;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}
