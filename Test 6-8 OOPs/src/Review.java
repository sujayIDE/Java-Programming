public class Review {
    private int reviewId;
    private Customer customer;
    private int rating;
    private String comment;

    public Review(int reviewId, Customer customer, int rating, String comment) {
        this.reviewId = reviewId;
        this.customer=customer;
        this.rating = rating;
        this.comment = comment;
    }


}
