package fooddeliveryapp;

public class Driver {
    public static void main(String[] args) {
        VegOrder vegOrder=new VegOrder(101,"Rohit","Baba",5,50);
        NonVegOrder nonVegOrder=new NonVegOrder(201,"Ajay","Sayaji",4,40);
        DessertOrder dessertOrder=new DessertOrder(301,"Mohit","King",6,10);

        Order[] orders={vegOrder,nonVegOrder,dessertOrder};
        for(Order order:orders)
        {
            order.displayOrderDetails();
            System.out.println();
            order.prepare();
            System.out.println();
            order.deliver();
            System.out.println();
            order.calculateBill();
            System.out.println("===================================================");
        }
    }
}
