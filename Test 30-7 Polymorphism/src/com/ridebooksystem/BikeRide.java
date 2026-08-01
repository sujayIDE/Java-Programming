package com.ridebooksystem;

public class BikeRide extends Ride {
    String rideType = "Bike";
    int baseFare = 30;
    int perkmkmCharge = 8;
    int totalFare;

    public BikeRide(int rideId, String customerName, String pickupLocation, String destination, int distance) {
        super(rideId, customerName, pickupLocation, destination, distance);
    }

    @Override
    void calculateFare() {
        totalFare = baseFare + (getDistance() * perkmkmCharge);
    }


    @Override
    public String toString() {
        displayRideDetails();
        calculateFare();
        return "Ride type : "+rideType +"\n"+
                "Base fare : "+baseFare+"\n"+
                "Distance : "+getDistance()+"\n"+
                "Total fare: "+totalFare;
    }
}
