package composition;

public class Main {
    public static void main(String[] args) {
        House house=new House(101,"Pune");

        System.out.println("House number: "+house.getHouseNumber());
        System.out.println("House address : "+house.getAddress());
        System.out.println("Room no. : "+house.getRoom().getRoomNumber());
        System.out.println("Room type : "+house.getRoom().getRoomType());
        System.out.println("Room area : "+house.getRoom().getArea());
    }
}
