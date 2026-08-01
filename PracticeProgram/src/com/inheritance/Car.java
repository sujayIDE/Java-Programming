package com.inheritance;

public class Car extends Vehicle{
    private String fuelType;
    private int seatingCapacity;

    public Car()
    {
        this(2323,"BMW",433.0,"Petrol",4);
        System.out.println("Car Default Constructor...");
    }

    public Car(int vehicleNumber, String brand, double price, String fuelType, int seatingCapacity) {
        super(vehicleNumber, brand, price);
        this.fuelType = fuelType;
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    void displayVehicle()
    {
        super.displayVehicle();
        System.out.println("FuelType: "+fuelType);
        System.out.println("SeatingCapaity: "+seatingCapacity);
    }

    void openSunroof()
    {
        System.out.println("Open Sunroof...");
    }

}

