package staticmethod;

public class Car extends Vehicle{
    public static void show(){
        System.out.println("Car show....");
    }

    public static void main(String[] args) {
        Vehicle car=new Car();
        car.show();
    }
}
