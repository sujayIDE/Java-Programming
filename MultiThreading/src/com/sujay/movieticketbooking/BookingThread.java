package com.sujay.movieticketbooking;

public class BookingThread extends Thread{
    Movie_Ticket movieTicket;
    int customerId;

    public BookingThread(Movie_Ticket movieTicket, int customerId) {
        this.movieTicket = movieTicket;
        this.customerId = customerId;
    }

    @Override
    public void run() {
        movieTicket.bookTicket(customerId);
    }
}
