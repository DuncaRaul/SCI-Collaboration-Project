package ro.springhotel.hotel.domain;

/**
 * @author Dani
 */
public class Room extends AbstractModel {

    private long id;
    private float pricePerDay;
    private int nrOfBeds;
    private boolean isOccupied;
    private TypeOfRoom typeOfRoom;

    public float getPricePerDay() {
        return pricePerDay;
    }

    public int getNrOfBeds() {
        return nrOfBeds;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public TypeOfRoom getTypeOfRoom() {
        return typeOfRoom;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Room{" +
                "pricePerDay=" + pricePerDay +
                ", nrOfBeds=" + nrOfBeds +
                ", isOccupied=" + isOccupied +
                ", typeOfRoom=" + typeOfRoom +
                '}';
    }
}
