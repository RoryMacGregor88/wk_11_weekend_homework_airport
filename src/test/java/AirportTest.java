import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class AirportTest {

    Airport airport;

    Airline airline1;
    Airline airline2;

    Plane plane1;
    Plane plane2;

    Flight flight1;
    Flight flight2;

    Hangar hangar1;
    Hangar hangar2;

    Ticket ticket1;
    Ticket ticket2;
    Ticket ticket3;

    Passenger passenger1;
    Passenger passenger2;

    @Before()
    public void before() {
        airport = new Airport("JFK");

        airline1 = new Airline("Airbus");
        airline2 = new Airline("British Airways");

        plane1 = new Plane(PlaneType.AIRBUS, airline1);
        plane2 = new Plane(PlaneType.LEARJET, airline1);

        hangar1 = new Hangar(1, plane1);
        hangar2 = new Hangar(2, plane2);
        airport.addHangar(hangar1);
        airport.addHangar(hangar2);

        flight1 = new Flight(plane1, 815, "Los Angeles");
        flight2 = new Flight(plane2, 180, "Paris");

        ticket1 = new Ticket(flight1, 599.99);
        ticket2 = new Ticket(flight2, 299.99);
        ticket3 = new Ticket(flight2, 299.99);

        passenger1 = new Passenger("Jack Shepherd",999.99);
        passenger2 = new Passenger("Alex Browning", 499.99);
    }

    @Test
    public void canAssignPlaneFromHangarAndCreateFlight() {
        airport.newflight(hangar1,19, "Moscow");
        assertEquals(1, airport.getNumberOfFlights());
    }

    @Test
    public void canSellTicketsForFlights() {
        airport.sellTicket(passenger1, ticket1);
        assertEquals(400.00, passenger1.getWalletBalance(), 0.01);
    }

    @Test
    public void canCountBookedPassengersForFlight() {
        airport.sellTicket(passenger1, ticket1);
        assertEquals(1, airport.flightPassengerCount(flight1));
    }

    @Test
    public void canNotSellTicketsIfFlightIsFullyBooked() {
        airport.sellTicket(passenger1, ticket2);
        airport.sellTicket(passenger2, ticket3);
        assertEquals(1, flight2.getPassengerCount());
    }

    @Test
    public void canAssignAppropriatePlane() {
        assertEquals();
    }

}
