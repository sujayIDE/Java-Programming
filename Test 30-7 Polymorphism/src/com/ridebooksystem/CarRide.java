package com.ridebooksystem;

public class CarRide extends Ride{
    String rideType="Car";
    int baseFare=80;
    int perKmCharge=15;
    int totalFare;

    public CarRide(int rideId, String customerName, String pickupLocation, String destination, int distance) {
        super(rideId, customerName, pickupLocation, destination, distance);
    }

    @Override
    void calculateFare() {
        totalFare=baseFare+(getDistance()*perKmCharge);
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
