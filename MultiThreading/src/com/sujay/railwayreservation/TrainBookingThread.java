package com.sujay.railwayreservation;

public class TrainBookingThread extends Thread{
    Train train;
    int passangerId;

    public TrainBookingThread(Train train, int passangerId) {
        this.train = train;
        this.passangerId = passangerId;
    }

    @Override
    public void run() {
        train.reservSeat(passangerId);
    }
}
