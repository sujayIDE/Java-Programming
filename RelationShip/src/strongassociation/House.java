package strongassociation;

public class House {
    private int houseNumber;
    private String ownerName;
    private Room room;

    public House(int houseNumber, String ownerName) {
        this.houseNumber = houseNumber;
        this.ownerName = ownerName;
        this.room=new Room(101,"AC");
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public Room getRoom() {
        return room;
    }


    void display()
    {
        System.out.println("House Number :"+houseNumber);
        System.out.println("Owner Name   :"+ownerName);
        System.out.println("Room Number  :"+room.getRoomNumber());
        System.out.println("Room Type    :"+room.getRoomType());
    }
}
