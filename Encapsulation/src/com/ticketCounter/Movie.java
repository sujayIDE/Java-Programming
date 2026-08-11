package com.ticketCounter;

public class Movie {
    private int ticketId;
    private int seatNumber;
    private double ticketPrice;
    private boolean booked;

    static int nextTicketId;
    static double totalRevenue;

    static {
        nextTicketId=121;
    }

    {
        booked=false;
    }

    public Movie( double ticketPrice, int seatNumber) {
        this.ticketId = nextTicketId++;
        this.ticketPrice = ticketPrice;
        this.seatNumber = seatNumber;
    }

    void bookTicket(){
        if(seatNumber>0 && ticketPrice>0 && !booked)
        {
            booked=true;
            totalRevenue+=ticketPrice;
        }
    }

    void cancelTicket()
    {
        if(booked)
        {
            booked=false;
            totalRevenue-=ticketPrice;
        }

    }

    static void getRevenue()
    {
        System.out.println("Total revenue : "+totalRevenue);
    }

    void display()
    {
        System.out.println("Ticket Id : "+ticketId);
        System.out.println("Seat Number ; "+seatNumber);
        System.out.println("Ticket Price : "+ticketPrice);
        System.out.println("Booking status : "+booked);
        System.out.println("Total revenue : "+totalRevenue);

    }
}
