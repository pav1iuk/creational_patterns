package com.example.behavioral;

import com.example.behavioral.chain_of_responsibility.*;
import com.example.behavioral.command.*;
import com.example.behavioral.iterator.*;
import com.example.behavioral.iterator.Iterator;
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
        Operator operator = new Operator();
        operator.handleRequest("simple question");

        // Command
        Client client = new Client();
        client.setCommand(new SendPackageCommand());
        client.sendRequest();

        // Visitor
        Visitor costCalculator = new DeliveryCostCalculator();
        Parcel parcel = new Parcel();
        Letter letter = new Letter();
        parcel.accept(costCalculator);
        letter.accept(costCalculator);

        // Iterator
        List<String> packages = Arrays.asList("P1", "P2", "P3");
        Iterator iterator = new PackageIterator(packages);
        while (iterator.hasNext()) {
            System.out.println("Посилка: " + iterator.next());
        }

        // Mediator
        Mediator mediator = new Mediator();
        mediator.sendMessage("Посилка відправлена!");

        // Memento
        PackageTracker tracker = new PackageTracker();
        tracker.setState("В дорозі");
        Memento memento = tracker.saveState();
        tracker.setState("Доставлено");
        tracker.restoreState(memento);

        // Observer
        PostOffice postOffice = new PostOffice();
        postOffice.addObserver(new Customer("Юра"));
        postOffice.notifyObservers("Посилка прибуває завтра!");

        // State
        PackageContext context = new PackageContext();
        context.setState("Відправлено");
        context.showState();

        // Strategy
        PricingStrategy strategy = new ExpressPricing();
        System.out.println("Ціна: " + strategy.calculatePrice(5));

        // Template Method
        DeliveryProcess delivery = new StandardDelivery();
        delivery.deliver();
    }
}
