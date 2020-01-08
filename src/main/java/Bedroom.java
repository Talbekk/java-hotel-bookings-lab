import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private ArrayList<Guest> occupants;
    private int capacity;
    private char type;

    public Bedroom(int roomNumber, int capacity, char type) {
        this.roomNumber = roomNumber;
        this.occupants = new ArrayList<Guest>();
        this.capacity = capacity;
        this.type = type;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public char getType() {
        return this.type;
    }


    public int guestCount() {
        return this.occupants.size();
    }
}
