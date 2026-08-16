package defaultstaticmethodsinterface;

public interface Vehicle {
    void start();

    default void stop(){
        System.out.println("Vehicle is stop...");
    }

    static void info(){
        System.out.println("Vehicles are used for transportation");
    }
}
