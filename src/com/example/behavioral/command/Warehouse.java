package com.example.behavioral.command;

public class Warehouse {
    public void sendPackage() {
        System.out.println("Склад відправляє посилку.");
    }

    public void receivePackage() {
        System.out.println("Склад приймає посилку.");
    }
}