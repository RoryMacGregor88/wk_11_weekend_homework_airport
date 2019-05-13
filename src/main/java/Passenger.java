import java.util.ArrayList;

public class Passenger {

    private String name;
    private double wallet;
    private ArrayList<Ticket> tickets;

    public Passenger(String name, double wallet){
        this.wallet = wallet;
        this.tickets = new ArrayList<>();
    }

    public double getWalletBalance() {
        return wallet;
    }

    public void buyTicket(Ticket ticket) {
        wallet -= ticket.getPrice();
        tickets.add(ticket);
    }

}
