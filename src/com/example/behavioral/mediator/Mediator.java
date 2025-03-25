package com.example.behavioral.mediator;

import java.util.*;

public class Mediator {
    private List<String> messages = new ArrayList<>();

    public void sendMessage(String message) {
        messages.add(message);
        System.out.println("Медіатор передає повідомлення: " + message);
    }
}
