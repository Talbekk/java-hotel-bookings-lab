import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest;

    @Before
    public void before() {
        bedroom = new Bedroom(6, 4, 'D');
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

}
