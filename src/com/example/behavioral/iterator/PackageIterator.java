package com.example.behavioral.iterator;

import java.util.*;

public class PackageIterator implements Iterator {
    private List<String> packages;
    private int index;

    public PackageIterator(List<String> packages) {
        this.packages = packages;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < packages.size();
    }

    @Override
    public Object next() {
        return hasNext() ? packages.get(index++) : null;
    }
}
