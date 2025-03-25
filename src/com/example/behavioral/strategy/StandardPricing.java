package com.example.behavioral.strategy;

public class StandardPricing implements PricingStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 10;
    }
}
