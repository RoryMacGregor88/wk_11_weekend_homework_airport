public class Ticket {

    private Flight flight;
    private double price;

    public Ticket(Flight flight, double price) {
        this.flight = flight;
        this.price = price;
    }

    public Flight getFlight() {
        return flight;
    }

    public double getPrice() {
        return price;
    }
}
