package composition;

public class House {
    private int houseNumber;
    private String address;
    private Room room;

    public House(int houseNumber, String address) {
        this.houseNumber = houseNumber;
        this.address = address;
        this.room = new Room(1,"AC",100);;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
