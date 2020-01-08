public class Booking {

    private int nights;
    private Bedroom bedroom;

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
}
