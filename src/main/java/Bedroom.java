import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private ArrayList<Guest> occupants;
    private int capacity;
    private char type;
    private boolean booked;
    private int rate;

    public Bedroom(int roomNumber, int capacity, char type, boolean booked, int rate) {
        this.roomNumber = roomNumber;
        this.occupants = new ArrayList<Guest>();
        this.capacity = capacity;
        this.type = type;
        this.booked = booked;
        this.rate = rate;
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

    public void addGuest(Guest guest) {
        this.occupants.add(guest);
    }

    public void removeGuests(){
        this.occupants.clear();
    }

    public boolean getBookedStatus() {
        return this.booked;
    }

    public void changeBookedStatus() {
        this.booked = !this.booked;
    }

    public int getRate() {
        return this.rate;
    }
}
