import java.util.ArrayList;
import java.util.Arrays;

public class Collections {
    public static void main(String[] args) {
        ArrayList<Product> products=new ArrayList<>();
        products.add(new Product(101,"Keyboard","Electronics","Circle",2000.0,20,1,5));
        products.add(new Product(201, "Smart Watch", "Accessories", "Circle", 4500.0, 25, 4, 10));
        products.add(new Product(202, "Gaming Chair", "Furniture", "Rectangle", 12000.0, 8, 5, 15));
        products.add(new Product(203, "Coffee Maker", "Home Appliance", "Cylinder", 3500.0, 12, 3, 8));
        products.add(new Product(204, "Backpack", "Bags", "Rectangle", 1800.0, 40, 4, 5));
        products.add(new Product(205, "Bluetooth Speaker", "Electronics", "Circle", 2500.0, 35, 5, 12));


        ArrayList<Customer> customers=new ArrayList<>();
        customers.add(new Customer(1, "Rohit", 8975132553L, "rohit@gmail.com", "MP"));
        customers.add(new Customer(2, "Amit", 9876543210L, "amit@gmail.com", "MH"));
        customers.add(new Customer(3, "Priya", 9123456789L, "priya@gmail.com", "KA"));
        customers.add(new Customer(4, "Sneha", 9988776655L, "sneha@gmail.com", "GJ"));
        customers.add(new Customer(5, "Rahul", 9012345678L, "rahul@gmail.com", "RJ"));

        ArrayList<Seller> sellers=new ArrayList<>();
        sellers.add(new Seller(1, "Mohit", "TATA", 5));
        sellers.add(new Seller(2, "Raj", "Amazon", 4));
        sellers.add(new Seller(3, "Neha", "Flipkart", 5));
        sellers.add(new Seller(4, "Vikas", "Reliance", 3));
        sellers.add(new Seller(5, "Anjali", "Samsung", 4));

        ArrayList<Order> orderArrayList=new ArrayList<>();
        orderArrayList.add(new OnlineOrder(1001, customers.get(0), products.get(0), 2, 4000.0, "Placed", "Pune"));
        orderArrayList.add(new OnlineOrder(1002, customers.get(1), products.get(1), 1, 55000.0, "Shipped", "Mumbai"));
        orderArrayList.add(new OnlineOrder(1003, customers.get(2), products.get(2), 1, 4500.0, "Delivered", "Bangalore"));
        orderArrayList.add(new OnlineOrder(1004, customers.get(3), products.get(3), 2, 6000.0, "Out For Delivery", "Ahmedabad"));
        orderArrayList.add(new OnlineOrder(1005, customers.get(4), products.get(4), 1, 2500.0, "Packed", "Jaipur"));

        ArrayList<Review> reviews=new ArrayList<>();
        reviews.add(new Review(1, customers.get(0), 5, "Excellent Product"));
        reviews.add(new Review(2, customers.get(1), 4, "Good Quality Product"));
        reviews.add(new Review(3, customers.get(2), 5, "Very Happy with Purchase"));
        reviews.add(new Review(4, customers.get(3), 3, "Average Product"));
        reviews.add(new Review(5, customers.get(4), 4, "Worth the Money"));


    }
}
