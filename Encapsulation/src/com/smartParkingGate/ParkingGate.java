package com.smartParkingGate;

public class ParkingGate {
    private int vehicleNumber;
    private int status;
    static int vehicleProcessed;

    public ParkingGate(int vehicleNumber, int status) {
        this.vehicleNumber = vehicleNumber;
        this.status = status;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static int getVehicleProcessed() {
        return vehicleProcessed;
    }

    public static void setVehicleProcessed(int vehicleProcessed) {
        ParkingGate.vehicleProcessed = vehicleProcessed;
    }

    void detectVehicle(){
        System.out.println("Vehicle Detected....");
    }

    void completePayment() {
        System.out.println("Payment completed.");
    }

    void identifyVIP() {
        System.out.println("VIP vehicle identified.");
    }

    void openGate() {
        System.out.println("Gate opened.");
    }

    void canEnter() {
        System.out.println("Vehicle can enter.");
    }

    void displayStatus() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Status : " + status);
    }
}
