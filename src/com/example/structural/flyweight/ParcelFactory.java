package com.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ParcelFactory {
    private static final Map<String, ParcelType> parcelTypes = new HashMap<>();

    public static ParcelType getParcelType(String type) {
        parcelTypes.putIfAbsent(type, new ParcelType(type));
        return parcelTypes.get(type);
    }
}
