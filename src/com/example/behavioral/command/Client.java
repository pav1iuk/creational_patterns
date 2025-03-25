package com.example.behavioral.command;

public class Client {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void sendRequest() {
        command.execute();
    }
}
