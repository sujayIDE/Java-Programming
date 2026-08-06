public class Seller {
    private int sellerId;
    private String sellerName;
    private String companyName;
    private int rating;

    public Seller(int sellerId, String sellerName, String companyName, int rating) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.companyName = companyName;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId=" + sellerId +
                ", sellerName='" + sellerName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", rating=" + rating +
                '}';
    }

    void displaySeller()
    {
        toString();
    }
}
