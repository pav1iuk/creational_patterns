package com.example.behavioral.mediator;
import java.util.*;

public class ChatMediator {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(String message, User sender) {
        for (User u : users) {
            if (u != sender) {
                u.receive(message);
            }
        }
    }
}
