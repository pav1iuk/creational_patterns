package com.example.structural.decorator;

import java.util.function.Function;

public class NewDecorator {
    public static void main(String[] args) {
        Function<String, String> basicParcel = desc -> desc;

        Function<String, String> fragileDecorator = desc -> basicParcel.apply(desc) + " with fragile handling";

        String description = fragileDecorator.apply("Basic parcel");

        System.out.println(description);
    }
}
