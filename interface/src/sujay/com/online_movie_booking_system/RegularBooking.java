package sujay.com.online_movie_booking_system;

public class RegularBooking implements Booking,Reciept{
    private int bookingId;
    private String customerName;
    private String movieName;
    private int ticketPrice;

    public RegularBooking(int bookingId, String customerName, String movieName, int ticketPrice) {
        this.bookingId = bookingId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void ticketBooking() {
        System.out.println("Regular Ticket Booked Successfully.");
    }

    @Override
    public void generateReceipt() {
        System.out.println("Receipt Generated........");
        System.out.println("Booking_ID: "+bookingId);
        System.out.println("Customer_Name: "+customerName);
        System.out.println("Movie_Name: "+movieName);
        System.out.println("Ticket_Price: "+ticketPrice);
    }

    @Override
    public String toString() {
        return "=====Booking Details======"+"\n"+
                "Booking_Id: "+bookingId+"\n"+
                "Customer_Name: "+customerName+"\n"+
                "Movie_Name: "+movieName+"\n"+
                "Ticket_Price: "+ticketPrice;
    }
}
