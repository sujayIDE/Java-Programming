package defaultstaticmethodsinterface;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car is started.....");
    }

    public static void main(String[] args) {
        Car car=new Car();
        car.start();
        Vehicle.info();
        car.stop();
    }
}
