package com.example.structural.decorator;

public class FragileParcelDecorator implements Parcel {
    private Parcel parcel;

    public FragileParcelDecorator(Parcel parcel) {
        this.parcel = parcel;
    }

    @Override
    public String getDescription() {
        return parcel.getDescription() + " with fragile handling";
    }
}
