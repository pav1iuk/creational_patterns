package com.example.behavioral.command;

public class SendPackageCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Посилка відправлена.");
    }
}
