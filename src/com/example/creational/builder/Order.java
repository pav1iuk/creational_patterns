package com.example.creational.builder;

public class Order {
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
