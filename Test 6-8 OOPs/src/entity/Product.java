package entity;

public class Product {
    private int productId;
    private String productName;
    private String category;
    private String brand;
    private double price;
    private int quanityInStock;
    private int sellerId;
    private int rating;

    public Product(int productId, String productName, String category, String brand, double price, int quanityInStock, int sellerId, int rating) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.quanityInStock = quanityInStock;
        this.sellerId = sellerId;
        this.rating = rating;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanityInStock() {
        return quanityInStock;
    }

    public void setQuanityInStock(int quanityInStock) {
        this.quanityInStock = quanityInStock;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", quanityInStock=" + quanityInStock +
                ", sellerId=" + sellerId +
                ", rating=" + rating +
                '}';
    }

    void displayProduct()
    {
        System.out.println(toString());
    }

}
