package com.sujay.railwayreservation;

public class Main {
    public static void main(String[] args) {
        Train train=new Train("Arjuna Express",3);

        for(int i=101;i<=105;i++)
        {
            TrainBookingThread bookingThread=new TrainBookingThread(train,i);
            bookingThread.start();
        }
    }
}
