package com.example.behavioral.strategy;

public class ExpressPricing implements PricingStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 20;
    }
}
