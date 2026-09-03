package composition;

public class Room {
    private int roomNumber;
    private String roomType;
    private int area;

    public Room(int roomNumber, String roomType, int area) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.area = area;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getArea() {
        return area;
    }
}
