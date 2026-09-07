import java.util.Scanner;

public class FoodItem {
    private int foodId;
    private String foodName;
    private int price;
    private String category;
    private String available;

    public FoodItem(int foodId, String foodName, int price, String category, String available) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.price = price;
        this.category = category;
        this.available = available;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", available='" + available + '\'' +
                '}';
    }
}
