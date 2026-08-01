abstract class Vehicle
{
    public String toString()
    {
        return "Vehicle";
    }
}

class Car extends Vehicle
{
    public String toString()
    {
        return super.toString() + " Car";
    }
}

public class Test1 {
    public static void main(String[] args) {
        Vehicle vc=new Car();
        System.out.println(vc);
    }
}
