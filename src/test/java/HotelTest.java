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
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan Towers", hotel.getName());
    }

    @Test
    public void roomsStartEmpty(){
        assertEquals(0, hotel.bedroomCount());
        assertEquals(0, hotel.conferenceRoomCount());
    }
}
