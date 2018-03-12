package ro.springhotel.hotel.domain;

/**
 * @author Dani
 */
public class PetCare {

    private int nrOfStandardKennels;
    private int nrOfPremiumKennels;
    private float pricePerDay;
    private boolean isAvaliable;
    private String typeOfService;

    public int getNrOfStandardKennels() {
        return nrOfStandardKennels;
    }

    public int getNrOfPremiumKennels() {
        return nrOfPremiumKennels;
    }

    public float getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    @Override
    public String toString() {
        return "PetCare{" +
                "nrOfStandardKennels=" + nrOfStandardKennels +
                ", nrOfPremiumKennels=" + nrOfPremiumKennels +
                ", pricePerDay=" + pricePerDay +
                ", isAvaliable=" + isAvaliable +
                ", typeOfService='" + typeOfService + '\'' +
                '}';
    }
}
