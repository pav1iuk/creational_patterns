package com.example.behavioral.command;
import java.util.*;

public class Client {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void processCommands() {
        for (Command c : commands) {
            c.execute();
        }
        commands.clear();
    }
}
