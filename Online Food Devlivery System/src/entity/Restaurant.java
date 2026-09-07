import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Restaurant {
    Scanner sc=new Scanner(System.in);
    private int restaurantId;
    private String restaurantName;
    private String location;
    private int rating;
    private ArrayList<FoodItem> foodItems;

    public Restaurant(int restaurantId, String restaurantName, String location, int rating, ArrayList<FoodItem> foodItems) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.location = location;
        this.rating = rating;
        this.foodItems=new ArrayList<>();
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<FoodItem> getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(ArrayList<FoodItem> foodItems) {
        this.foodItems = foodItems;
    }

    void addFoodItem(FoodItem item)
    {
        foodItems.add(item);
        System.out.println("Item added successfully..");
    }

    void removeFoodItem(int foodId)
    {
        for(FoodItem foodItem:foodItems)
        {
            if(foodItem.getFoodId()==foodId)
            {
                foodItems.remove(foodItem);
                System.out.println("Item removed successfully...");
                return;
            }
        }
    }

    void displayMenu(FoodItem item)
    {
        System.out.println("FoodItem Id : "+item.getFoodId());
        System.out.println("FoodItem Name: "+item.getFoodName());
        System.out.println("Food Price : "+item.getPrice());
        System.out.println("Food Category : "+item.getCategory());
        System.out.println("Food Availability : "+item.getAvailable());
    }

    void searchFoodItem(FoodItem item)
    {
        System.out.println("Enter Food Item to search : ");
        String name=sc.nextLine();
        if(item.getFoodName().equalsIgnoreCase(name))
        {
            System.out.println(item);
        }
    }

    void changeAvailability(FoodItem item)
    {
        System.out.println("Current availability : "+item.getAvailable());

        System.out.println("Enter New Availability : (yes/no) -> ");
        String available=sc.nextLine();

        item.setAvailable(available);
        System.out.println("Availabilty status change successful....");
    }
}
