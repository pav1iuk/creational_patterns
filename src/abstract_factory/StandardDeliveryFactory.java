package abstract_factory;

public class StandardDeliveryFactory implements DeliveryFactory {
    public DeliveryService createDelivery() {
        return new StandardDelivery();
    }
}
