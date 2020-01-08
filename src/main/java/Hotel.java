import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;


    public Hotel(String name) {
        this.name = name;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }


    public String getName() {
        return this.name;
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkInGuest(Bedroom bedroom, Guest guest) {
        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Bedroom bedroom) {
        bedroom.removeGuests();
    }

    public Booking bookRoom(Bedroom bedroom, int nights) {
        if (bedroom.getBookedStatus() == false) {
            Booking booking = new Booking();
            booking = booking.newBooking(bedroom, nights);
            bedroom.changeBookedStatus();
            return booking;
            }
        return null;
    }

    public ArrayList<Bedroom> getVacantRooms() {

        ArrayList<Bedroom> vacantBedrooms = new ArrayList<Bedroom>();

        for (Bedroom room: this.bedrooms) {
            if (room.getBookedStatus() == false) {
                vacantBedrooms.add(room);
            }
        }
            return vacantBedrooms;
        }



}
