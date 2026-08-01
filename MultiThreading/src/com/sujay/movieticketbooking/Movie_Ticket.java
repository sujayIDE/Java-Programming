package com.sujay.movieticketbooking;

public class Movie_Ticket {
    private String movieName="Avengers";
    private int availableSeats=5;

    public synchronized void bookTicket(int customerId)
    {
        try{
            if(availableSeats<=0)
            {
                throw new RuntimeException("Seat not available");
            }
            System.out.println("Seat Booked: "+customerId);
            availableSeats-=1;
            System.out.println("available seats: "+availableSeats);
        } catch (RuntimeException e) {
            System.out.println("Customer: "+customerId+" : "+e.getMessage());
        }

    }
}
