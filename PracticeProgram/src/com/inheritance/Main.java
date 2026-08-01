package com.inheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.displayVehicle();
        vehicle.startEngine();
        System.out.println();
        Car car=new Car();
        car.displayVehicle();
        car.startEngine();
        car.openSunroof();
        System.out.println();
        SportCar sportCar=new SportCar();
        sportCar.displayVehicle();
        sportCar.startEngine();
    }
}
