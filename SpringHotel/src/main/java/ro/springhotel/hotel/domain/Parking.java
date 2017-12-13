package ro.springhotel.hotel.domain;

public class Parking {

    private int nrOfSpots;
    private boolean isAvailable;

    public int getNrOfSpots() {
        return nrOfSpots;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "nrOfSpots=" + nrOfSpots +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
