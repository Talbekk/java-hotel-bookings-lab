import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(6, 4, 'D', false, 70);
        guest = new Guest("Jeremy");
    }

    @Test
    public void hasRoomNumber() {
        assertEquals(6, bedroom.getRoomNumber());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, bedroom.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals('D', bedroom.getType());
    }

    @Test
    public void occupantsStartsEmpty() {
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void canRemoveGuests(){
        bedroom.removeGuests();
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void isVacant(){
        assertFalse(bedroom.getBookedStatus());
    }

    @Test
    public void canChangeBookedStatus() {
        bedroom.changeBookedStatus();
        assertEquals(true, bedroom.getBookedStatus());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(70, bedroom.getRate());
    }

}
