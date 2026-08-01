package com.ridebooksystem;

public class AutoRide extends Ride{
    String rideType="Autoride";
    int baseFare=50;
    int perKmCharge=10;
    int totalFare;

    public AutoRide(int rideId, String customerName, String pickupLocation, String destination, int distance) {
        super(rideId, customerName, pickupLocation, destination, distance);
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
