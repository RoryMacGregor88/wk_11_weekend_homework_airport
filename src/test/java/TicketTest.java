import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class TicketTest {

    Ticket ticket;
    Flight flight;
    Plane plane;
    Airline airline;

    @Before()
    public void before() {
        airline = new Airline("Concorde");
        plane = new Plane(PlaneType.CONCORDE, airline);
        flight = new Flight(plane, 815, "Los Angeles");
        ticket = new Ticket(flight, 599.99);
    }

    @Test
    public void CanGetFlightBack() {
        assertEquals(flight, ticket.getFlight());
    }
}
