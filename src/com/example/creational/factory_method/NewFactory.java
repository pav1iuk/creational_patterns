package com.example.creational.factory_method;

import java.util.Map;
import java.util.function.Supplier;

public class NewFactory {
    private static final Map<String, Supplier<Parcel>> parcelCreators = Map.of(
            "small", SmallParcel::new,
            "large", LargeParcel::new
    );

    public static Parcel createParcel(String type) {
        Supplier<Parcel> creator = parcelCreators.get(type);
        if (creator != null) {
            return creator.get();
        }
        throw new IllegalArgumentException("Невідомий тип посилки");
    }

    public static void main(String[] args) {
        Parcel small = ParcelFactory.createParcel("small");
        small.deliver();

        Parcel large = ParcelFactory.createParcel("large");
        large.deliver();
    }
}
