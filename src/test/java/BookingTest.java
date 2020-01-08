import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom;

    @Before
    public void before() {
        booking = new Booking(3, bedroom);
        bedroom = new Bedroom(1, 4, 'D', false, 70);
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

    @Test
    public void canMakeNewBooking() {
        Booking anObject = booking.newBooking(bedroom, 3);
        assertTrue(anObject.getClass() == Booking.class);
    }

    @Test
    public void getTotalCostOfBooking(){
        booking.addRoom(bedroom);
        assertEquals(210, booking.getBill());
    }

}
