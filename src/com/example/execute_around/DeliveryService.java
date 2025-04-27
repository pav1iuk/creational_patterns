package com.example.execute_around;

public class DeliveryService {

    public void executeAroundDelivery(DeliveryOperation operation) {
        openDeliverySession();
        try {
            operation.perform();
        } finally {
            closeDeliverySession();
        }
    }

    private void openDeliverySession() {
        System.out.println("Відкриваємо сесію доставки...");
    }

    private void closeDeliverySession() {
        System.out.println("Закриваємо сесію доставки.");
    }
}
