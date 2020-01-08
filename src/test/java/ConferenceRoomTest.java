import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest;

    @Before

    public void setup(){
        conferenceRoom = new ConferenceRoom("Ben Nevis", 50);
        guest = new Guest("Donald");
    }

    @Test
    public void hasName(){
        assertEquals("Ben Nevis", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(50, conferenceRoom.getCapacity());
    }

    @Test
    public void occupancyStartsEmpty(){
        assertEquals(0, conferenceRoom.guestCount());
    }
}
