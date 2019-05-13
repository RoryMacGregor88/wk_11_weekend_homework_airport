import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private int flightNumber;
    private String destination;
    private ArrayList<Passenger> passengerManifest;
    private int availableSpace;

    public Flight(Plane plane, int flightNumber, String destination) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.passengerManifest = new ArrayList<>();
        this.availableSpace = plane.getPlaneType().getCapacity();
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane newPlane) {
        plane = newPlane;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getPassengerCount() {
        return passengerManifest.size();
    }

    public void addPassengerToPassengerManifest(Passenger passenger) {
        passengerManifest.add(passenger);
        availableSpace --;
    }

    public int getAvailableSpace() {
        return availableSpace;
    }

}
