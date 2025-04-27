package com.example.behavioral;

import com.example.behavioral.chain_of_responsibility.*;
import com.example.behavioral.command.*;
import com.example.behavioral.iterator.*;
import com.example.behavioral.mediator.*;
import com.example.behavioral.memento.*;
import com.example.behavioral.observer.*;
import com.example.behavioral.state.*;
import com.example.behavioral.strategy.*;
import com.example.behavioral.template_method.*;
import com.example.behavioral.visitor.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Chain of Responsibility
        Operator op = new Operator();
        Manager manager = new Manager();
        Director director = new Director();
        op.setNext(manager);
        manager.setNext(director);
        op.handleRequest("track");
        op.handleRequest("complaint");
        op.handleRequest("refund");

        // Command
        Warehouse warehouse = new Warehouse();
        Client client = new Client();
        client.addCommand(new SendPackageCommand(warehouse));
        client.addCommand(new ReceivePackageCommand(warehouse));
        client.processCommands();

        // Visitor
        Parcel parcel = new Parcel();
        Letter letter = new Letter();
        Visitor calculator = new DeliveryCostCalculator();
        parcel.accept(calculator);
        letter.accept(calculator);

        // Iterator
        List<String> packageList = Arrays.asList("Box1", "Box2", "Box3");
        PackageIterator packageIterator = new PackageIterator(packageList);
        while (packageIterator.hasNext()) {
            System.out.println("Відправлення: " + packageIterator.next());
        }

        // Mediator
        ChatMediator chat = new ChatMediator();
        User u1 = new User("Іван", chat);
        User u2 = new User("Оля", chat);
        chat.addUser(u1);
        chat.addUser(u2);
        u1.send("Посилка готова до відправки");

        // Memento
        PackageTracker tracker = new PackageTracker();
        tracker.setStatus("Відправлено");
        Memento saved = tracker.save();
        tracker.setStatus("Затримка");
        System.out.println("Поточний статус: " + tracker.getStatus());
        tracker.restore(saved);
        System.out.println("Відновлений статус: " + tracker.getStatus());

        // Observer
        NotificationService service = new NotificationService();
        service.subscribe(new Customer("Ігор"));
        service.subscribe(new Customer("Марія"));
        service.notifyAllObservers("Ваші посилки прибули на відділення!");

        // State
        DeliveryContext context = new DeliveryContext();
        context.setState(new InTransit());
        context.request();
        context.setState(new Delivered());
        context.request();

        // Strategy
        DeliveryService ds = new DeliveryService();
        ds.setStrategy(new RoadDelivery());
        ds.deliverPackage();
        ds.setStrategy(new AirDelivery());
        ds.deliverPackage();

        // Template Method
        DeliveryProcess express = new ExpressDelivery();
        express.deliver();
    }
}
