package com.ridebooksystem;

public class Ride {
    private int rideId;
    private String customerName;
    private String pickupLocation;
    private String destination;
    private int distance;

    public Ride(int rideId, String customerName, String pickupLocation, String destination, int distance) {
        this.rideId = rideId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.destination = destination;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    void displayRideDetails()
    {
        System.out.println("Ride ID         :"+rideId);
        System.out.println("Customer Name   :"+customerName);
        System.out.println("PickUp Location :"+pickupLocation);
        System.out.println("Destination     :"+destination);
        System.out.println("Distance        :"+distance);
    }

    void calculateFare()
    {
        System.out.println("Calculating ride fare.....");
    }

    public String toString()
    {
        return "Ride Details....";
    }

}
