package defaultstaticmethodsinterface.vehicle;

public class Car implements Vehicle{
    static void show()
    {
        System.out.println("Car static..");
    }

    @Override
    public void start() {
        System.out.println("car started......");
    }
}
