import java.util.Scanner;

class Food{
    public int getPrice(String foodName)
    {
        if(foodName.equalsIgnoreCase("Pizza"))
        {
            return 300;
        } else if (foodName.equalsIgnoreCase("Burger")) {
            return 150;
        } else if (foodName.equalsIgnoreCase("Pasta")) {
            return 250;
        }else
            return 0;
    }

    public void placeOrder(String foodName)
    {
        int price=getPrice(foodName);
        int quanity=1;
        int total=price*quanity;
        System.out.println("=======Food Order Summary=======");
        System.out.println("Food Item: "+foodName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quanity);
        System.out.println("Total bill: "+total);
        System.out.println("Coupon: "+"Not applied");
        System.out.println("Order Successfully placed");
    }

    public void placeOrder(String foodName,int quantity)
    {
        String food_Name=foodName;
        int price=getPrice(foodName);
        int quanity=quantity;
        int total=price*quanity;
        System.out.println("=======Food Order Summary=======");
        System.out.println("Food Item: "+food_Name);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quanity);
        System.out.println("Total bill: "+total);
        System.out.println("Coupon: "+"Not applied");
        System.out.println("Order Successfully placed");
    }

    public void placeOrder(String foodName,int quantity,String couponCode)
    {
        int price=getPrice(foodName);
        int quanity=quantity;
       // String coupuncode=couponCode;
        int total=price*quanity;
        System.out.println("=======Food Order Summary=======");
        System.out.println("Food Item: "+foodName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quanity);
        System.out.println("Total bill: "+total);
        System.out.println("Coupon applied: "+couponCode);
        System.out.println("Order Successfully placed");
    }
}
public class Food_Delivery_App {
    public static void main(String[] args) {
        Food order=new Food();
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose order type: ");
        System.out.println("1.Item");
        System.out.println("2.Item+quantity");
        System.out.println("3.Item+quantity+couponCode");
        System.out.println("Enter choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        switch (choice)
        {
            case 1:
                System.out.println("Food Item: ");
                String item1=sc.nextLine();
                order.placeOrder(item1);
                break;

            case 2:
                System.out.println("Food Item: ");
                String item2=sc.nextLine();
                System.out.println("Quantity");
                int quantity1=sc.nextInt();
                order.placeOrder(item2,quantity1);
                break;

            case 3:
                System.out.println("Food Item: ");
                String item3=sc.nextLine();
                System.out.println("Quantity: ");
                int quantity2=sc.nextInt();
                System.out.println("Coupon_Code: ");
                String couponCode=sc.nextLine();
                order.placeOrder(item3,quantity2,couponCode);
                break;
        }
    }
}
