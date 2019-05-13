public enum PlaneType {

    AIRBUS(500),
    BOEING(300),
    CONCORDE(250),
    BOMBARDIER(200),
    LOCKHEED(150),
    HAWKER(25),
    FALCON(20),
    GULFSTREAM(15),
    LEARJET(1);

    private final int capacity;

    PlaneType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

}
