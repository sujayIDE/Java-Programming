package com.inheritance;

public class SportCar extends Vehicle{
    private int topspeed;
    private boolean turboEnabled;

    public SportCar()
    {
        this(6554,"Ferari",87555.0,400,true);
        System.out.println("SportCar Default Constructor...");
    }

    public SportCar(int vehicleNumber, String brand, double price, int topspeed, boolean turboEnabled) {
        super(vehicleNumber, brand, price);
        this.topspeed = topspeed;
        this.turboEnabled = turboEnabled;
    }

    @Override
    void startEngine()
    {
        super.startEngine();
    }
    @Override
    void displayVehicle()
    {
        super.displayVehicle();
        System.out.println("Top Speed: "+topspeed);
        System.out.println("TurboEnabled: "+turboEnabled);
    }
}
