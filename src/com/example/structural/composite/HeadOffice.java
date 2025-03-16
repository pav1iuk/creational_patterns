package com.example.structural.composite;

import java.util.*;

public class HeadOffice implements Department {
    private List<Department> departments = new ArrayList<>();

    public void addDepartment(Department dept) {
        departments.add(dept);
    }

    @Override
    public void showDetails() {
        for (Department dept : departments) {
            dept.showDetails();
        }
    }
}