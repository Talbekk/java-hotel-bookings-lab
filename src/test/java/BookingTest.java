import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before() {
        booking = new Booking(3, bedroom);
        bedroom = new Bedroom(1, 4, 'D');
    }

    @Test
    public void hasBedroom() {
        booking.addRoom(bedroom);
        assertEquals(bedroom, booking.hasRoom());
    }

    @Test
    public void canAddRoom() {
        booking.addRoom(bedroom);
        assertEquals(bedroom, booking.hasRoom());
    }

    @Test
    public void hasNumberOfNights() {
        assertEquals(3, booking.getNights());
    }

}
