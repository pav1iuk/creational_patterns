import java.util.*;

// Singleton
class BranchManager {
    private static BranchManager instance;
    private List<String> branches = new ArrayList<>();

    private BranchManager() {}

    public static BranchManager getInstance() {
        if (instance == null) {
            instance = new BranchManager();
        }
        return instance;
    }

    public void addBranch(String branch) {
        branches.add(branch);
    }

    public void showBranches() {
        System.out.println("Відділення: " + branches);
    }
}

// Factory Method
interface Parcel {
    void deliver();
}

class SmallParcel implements Parcel {
    public void deliver() {
        System.out.println("Доставка малої посилки.");
    }
}

class LargeParcel implements Parcel {
    public void deliver() {
        System.out.println("Доставка великої посилки.");
    }
}

class ParcelFactory {
    public static Parcel createParcel(String type) {
        return switch (type) {
            case "small" -> new SmallParcel();
            case "large" -> new LargeParcel();
            default -> throw new IllegalArgumentException("Невідомий тип посилки");
        };
    }
}

// Builder
class Order {
    private String sender;
    private String receiver;
    private String parcelType;

    private Order() {}

    public static class Builder {
        private Order order = new Order();

        public Builder setSender(String sender) {
            order.sender = sender;
            return this;
        }

        public Builder setReceiver(String receiver) {
            order.receiver = receiver;
            return this;
        }

        public Builder setParcelType(String parcelType) {
            order.parcelType = parcelType;
            return this;
        }

        public Order build() {
            return order;
        }
    }

    public void showOrder() {
        System.out.println("Замовлення: Відправник - " + sender + ", Одержувач - " + receiver + ", Тип посилки - " + parcelType);
    }
}

// Prototype
class Shipment implements Cloneable {
    private String details;

    public Shipment(String details) {
        this.details = details;
    }

    public void showDetails() {
        System.out.println("Деталі відправлення: " + details);
    }

    @Override
    protected Shipment clone() {
        return new Shipment(this.details);
    }
}

// Abstract Factory
interface DeliveryService {
    void send();
}

class StandardDelivery implements DeliveryService {
    public void send() {
        System.out.println("Відправлення стандартною доставкою.");
    }
}

class ExpressDelivery implements DeliveryService {
    public void send() {
        System.out.println("Відправлення експрес-доставкою.");
    }
}

interface DeliveryFactory {
    DeliveryService createDelivery();
}

class StandardDeliveryFactory implements DeliveryFactory {
    public DeliveryService createDelivery() {
        return new StandardDelivery();
    }
}

class ExpressDeliveryFactory implements DeliveryFactory {
    public DeliveryService createDelivery() {
        return new ExpressDelivery();
    }
}

class NovaPoshta {
    public static void main(String[] args) {
        // Singleton
        BranchManager manager = BranchManager.getInstance();
        manager.addBranch("Чернівці-1");
        manager.addBranch("Львів-2");
        manager.showBranches();

        // Factory Method
        Parcel smallParcel = ParcelFactory.createParcel("small");
        smallParcel.deliver();

        Parcel largeParcel = ParcelFactory.createParcel("large");
        largeParcel.deliver();

        // Builder
        Order order = new Order.Builder()
                .setSender("Олексій")
                .setReceiver("Марія")
                .setParcelType("Документи")
                .build();
        order.showOrder();

        // Prototype
        Shipment original = new Shipment("Посилка #12345");
        Shipment copy = original.clone();
        original.showDetails();
        copy.showDetails();

        // Abstract Factory
        DeliveryFactory standardFactory = new StandardDeliveryFactory();
        DeliveryService standardService = standardFactory.createDelivery();
        standardService.send();

        DeliveryFactory expressFactory = new ExpressDeliveryFactory();
        DeliveryService expressService = expressFactory.createDelivery();
        expressService.send();
    }
}
