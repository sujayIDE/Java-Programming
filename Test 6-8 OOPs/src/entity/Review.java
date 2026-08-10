package entity;

import java.util.Scanner;

public class Review {
    private int reviewId;
    private Customer customer;
    private String rating;
    private String comment;

    public Review(int reviewId, Customer customer) {
        this.reviewId = reviewId;
        this.customer=customer;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    Scanner sc=new Scanner(System.in);
    public void addReview()
    {
        System.out.println("Enter you review : ");
        String review=sc.nextLine();

        System.out.println("Enter Comment : ");
        String comment=sc.nextLine();

        setRating(review);
        setComment(comment);
    }

    public void displayReview()
    {
        System.out.println("Review : "+getRating());
        System.out.println("Comment : "+getComment());
    }
}
