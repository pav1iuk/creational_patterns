package com.example.behavioral.command;

public class ReceivePackageCommand implements Command {
    private Warehouse warehouse;

    public ReceivePackageCommand(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void execute() {
        warehouse.receivePackage();
    }
}
