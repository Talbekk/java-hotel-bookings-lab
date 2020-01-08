public class Booking {

    private int nights;
    private Bedroom bedroom;

    public Booking(){

    }

    public Booking(int nights, Bedroom bedroom) {
        this.nights = nights;
        this.bedroom = bedroom;
    }

    public void addRoom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public Bedroom hasRoom() {
        return this.bedroom;
    }

    public int getNights() {
        return this.nights;
    }

    public Booking newBooking(Bedroom bedroom, int nights) {
        Booking booking = new Booking(nights, bedroom);
        return booking;
    }

    public int getBill() {
        return this.nights * bedroom.getRate();
    }
}
