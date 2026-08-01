package com.inheritance;

public class Vehicle {
    private int vehicleNumber;
    private String brand;
    private double price;

    public Vehicle()
    {
        System.out.println("Vehicle Default constructor...");
    }

    public Vehicle(int vehicleNumber, String brand, double price) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.price = price;
    }

    void displayVehicle()
    {
        System.out.println("VehicleNumber: "+vehicleNumber);
        System.out.println("Brand: "+brand);
        System.out.println("Price: "+price);
    }

    void startEngine()
    {
        System.out.println("Engine Start: "+brand);
    }
}
