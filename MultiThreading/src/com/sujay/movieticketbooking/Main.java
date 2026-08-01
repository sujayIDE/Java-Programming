package com.sujay.movieticketbooking;

public class Main {
    public static void main(String[] args) {
        Movie_Ticket movieTicket=new Movie_Ticket();
        for (int i = 101; i <= 110; i++) {
            BookingThread thread = new BookingThread(movieTicket, i);
            thread.start();
        }

    }
}
