package com.example.execute_around;

public class DeliveryApp {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();

        deliveryService.executeAroundDelivery(() ->
                System.out.println("Відправляємо малу посилку.")
        );

        System.out.println();

        deliveryService.executeAroundDelivery(() ->
                System.out.println("Відправляємо велику посилку.")
        );

        System.out.println();

        deliveryService.executeAroundDelivery(() ->
                System.out.println("Відправляємо крихку посилку з обережністю.")
        );
    }
}
