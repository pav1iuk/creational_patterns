package com.example.behavioral.command;

public class SendPackageCommand implements Command {
    private Warehouse warehouse;

    public SendPackageCommand(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void execute() {
        warehouse.sendPackage();
    }
}
