package com.vehiclehierarchysystem;

public class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void displayInfo()
    {
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
    }
}

