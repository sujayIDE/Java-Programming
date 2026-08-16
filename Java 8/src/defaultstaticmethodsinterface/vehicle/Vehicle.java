package defaultstaticmethodsinterface.vehicle;

public interface Vehicle {
    static void show()
    {
        System.out.println("Vehicle static....");
    }

    default void start()
    {
        System.out.println("Vehicle started...");
    }
}
