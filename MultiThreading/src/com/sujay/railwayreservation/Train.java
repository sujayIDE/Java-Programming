package com.sujay.railwayreservation;

public class Train {
    private String trainName;
    private int availableSeats;

    public Train(String trainName, int availableSeats) {
        this.trainName = trainName;
        this.availableSeats = availableSeats;
    }

    public void reservSeat(int passengerId){
        System.out.println("Passenger " + passengerId + " is requesting a seat.");
        synchronized (this)
        {
            if(availableSeats<=0){
                System.out.println("Passanger: "+passengerId+" seat not available...");
            }else {
                System.out.println(passengerId+": Seat Book Successfull...");
                availableSeats--;
                System.out.println("Available seats: "+availableSeats);
            }
        }

    }
}
