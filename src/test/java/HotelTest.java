import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Guest guest;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before

    public void before(){

        hotel = new Hotel("CodeClan Towers");
        guest = new Guest("Donald");
        bedroom = new Bedroom(4, 2, 'S');
        conferenceRoom = new ConferenceRoom("Ben Nevis", 50);

        hotel.addBedroom(bedroom);
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
        assertEquals(2, hotel.bedroomCount());
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
}
