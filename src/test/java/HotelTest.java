import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private Bedroom bedroom;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom;
    private Booking booking;

    @Before

    public void before(){

        hotel = new Hotel("CodeClan Towers");
        guest = new Guest("Donald");
        bedroom = new Bedroom(4, 2, 'S', false, 70);
        bedroom2 = new Bedroom( 3, 4, 'D', false, 120);
        conferenceRoom = new ConferenceRoom("Ben Nevis", 50);

        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addConferenceRoom(conferenceRoom);

    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void roomsStartEmpty(){
        Hotel hauntedHotel = new Hotel("Dracula Manor");
        assertEquals(0, hauntedHotel.bedroomCount());
        assertEquals(0, hauntedHotel.conferenceRoomCount());
    }

    @Test
    public void canAddRoom(){
        hotel.addBedroom(bedroom);
        assertEquals(3, hotel.bedroomCount());
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(2, hotel.conferenceRoomCount());
    }

    @Test public void canCheckInGuest(){
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canCheckOutGuest(){
        hotel.checkOutGuest(bedroom);
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canBookRoom(){
        hotel.bookRoom(bedroom, 5);
        assertEquals(true, bedroom.getBookedStatus());

    }

    @Test
    public void cantBookRoomIfOccupied() {
        hotel.bookRoom(bedroom, 5);
        assertEquals(true, bedroom.getBookedStatus());
        assertEquals(null, hotel.bookRoom(bedroom, 2));
    }

    @Test
    public void canGetCollectionOfVacantRooms() {
        hotel.bookRoom(bedroom, 5);
        assertEquals(1, hotel.getVacantRooms().size());
    }
}
