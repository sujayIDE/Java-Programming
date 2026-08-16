package defaultstaticmethodsinterface.vehicle;

public class SportCar extends Car{
    static void show(){
        System.out.println("Sportcar static....");
    }

    @Override
    public void start() {
        System.out.println("SportCar started.....");
    }

    public static void main(String[] args) {
        Vehicle vehicle=new SportCar();
        Vehicle.show();
        vehicle.start();

        Car car=new SportCar();
        Car.show();
        car.start();

        SportCar sportCar=new SportCar();
        SportCar.show();
        sportCar.start();

    }
}
