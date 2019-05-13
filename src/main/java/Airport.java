import java.util.ArrayList;
import java.util.Collections;

public class Airport {

    private String airportCode;
    private ArrayList<Hangar> hangars;
    private ArrayList<Flight> departures;

    public Airport (String airportCode){
        this.airportCode = airportCode;
        this.hangars = new ArrayList<>();
        this.departures = new ArrayList<>();
    }

    public String getAirportCode() {
        return airportCode;
    }

    public ArrayList getHangars() {
        return hangars;
    }

    public void addHangar(Hangar hangar) {
        hangars.add(hangar);
    }

    public ArrayList<Integer> mapHangars() {
        ArrayList<Integer> hangarNumbers = new ArrayList<>();

        for (int i = 0; i < hangars.size(); i++) {
           int capacity =  hangars.get(i).getPlane().getPlaneType().getCapacity();
           hangarNumbers.add(capacity);
        }
        return hangarNumbers;
    }

    public Object getDepartures() {
        return departures;
    }

    public void newflight(Hangar hangar, int flightNumber, String destination) {

        Flight flight = new Flight(hangar.getPlane(), flightNumber, destination);
        departures.add(flight);
    }

    public int getNumberOfFlights() {
        return departures.size();
    }

    public void sellTicket(Passenger passenger, Ticket ticket) {
        Flight flight = ticket.getFlight();

        if(flight.getAvailableSpace() == 0){
            return;
        } else {
            passenger.buyTicket(ticket);
            flight.addPassengerToPassengerManifest(passenger);
        }
    }

    public int flightPassengerCount(Flight flight) {
        return flight.getPassengerCount();
    }

    public ArrayList<Integer> assignAppropriatePlane(int passengerCount) {
        ArrayList<Integer> hangars = mapHangars();

    }

}
