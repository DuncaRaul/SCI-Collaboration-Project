package ro.springhotel.hotel.domain;

import java.util.Date;
import java.util.Objects;

/**
 * @author Raul
 */
public class Booking extends AbstractModel{

   private String name;
   private String email;
   private int phoneNumber;
   private int hasParking;
   private int hasPetCare;
   private Date checkIn;
   private Date CheckOut;
   private int numberOfPeople;
   private String additionalInformation = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return CheckOut;
    }

    public void setCheckOut(Date checkOut) {
        CheckOut = checkOut;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int members) {
        this.numberOfPeople = members;
    }

    public int getHasParking() {
        return hasParking;
    }

    public void setHasParking(int hasParking) {
        this.hasParking = hasParking;
    }

    public int getHasPetCare() {
        return hasPetCare;
    }

    public void setHasPetCare(int hasPetCare) {
        this.hasPetCare = hasPetCare;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return phoneNumber == booking.phoneNumber &&
                numberOfPeople == booking.numberOfPeople &&
                hasParking == booking.hasParking &&
                hasPetCare == booking.hasPetCare &&
                Objects.equals(name, booking.name) &&
                Objects.equals(email, booking.email) &&
                Objects.equals(checkIn, booking.checkIn) &&
                Objects.equals(CheckOut, booking.CheckOut) &&
                Objects.equals(additionalInformation, booking.additionalInformation);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, email, phoneNumber, checkIn, CheckOut, numberOfPeople, hasParking, hasPetCare, additionalInformation);
    }

    @Override
    public String toString() {
        return "Booking{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", checkIn=" + checkIn +
                ", CheckOut=" + CheckOut +
                ", numberOfPeople=" + numberOfPeople +
                ", hasParking=" + hasParking +
                ", hasPetCare=" + hasPetCare +
                ", additionalInformation='" + additionalInformation + '\'' +
                '}';
    }
}
