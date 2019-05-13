public class Hangar {

    private int number;
    private Plane plane;

    public Hangar(int number, Plane plane) {
        this.number = number;
        this.plane = plane;
    }

    public Plane getPlane() {
        return plane;
    }

}
