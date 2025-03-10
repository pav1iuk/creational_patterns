package abstract_factory;

public class StandardDelivery implements DeliveryService {
    public void send() {
        System.out.println("Відправлення стандартною доставкою.");
    }
}
