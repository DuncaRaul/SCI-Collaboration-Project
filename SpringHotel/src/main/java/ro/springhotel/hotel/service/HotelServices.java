package ro.springhotel.hotel.service;

import ro.springhotel.hotel.domain.AbstractModel;

/**
 * @author Dunca Raul
 * A domain class for all the services the hotel offers
 */
public class HotelServices extends AbstractModel {

    private int singleRooms;
    private int apartments;
    private int penthouse;
    private int nrOfStandardKennels;
    private int nrOfPremiumKennels;
    private int nrOfSpots;

    public HotelServices(int singleRooms, int apartments, int penthouse,
                         int nrOfStandardKennels, int nrOfPremiumKennels, int nrOfSpots) {


        this.singleRooms = singleRooms;
        this.apartments = apartments;
        this.penthouse = penthouse;
        this.nrOfStandardKennels = nrOfStandardKennels;
        this.nrOfPremiumKennels = nrOfPremiumKennels;
        this.nrOfSpots = nrOfSpots;
    }


    public void subtractSingleRoom() {
        singleRooms = singleRooms - 1;
    }


    public void subtractApartment() {
        apartments = apartments - 1;
    }

    public void subtractPenthouse() {
        penthouse = penthouse - 1;
    }

    public void reserveKennel(int i) {
        nrOfStandardKennels = nrOfStandardKennels - i;
    }


    public int getSingleRooms() {
        return singleRooms;
    }

    public void setSingleRooms(int singleRooms) {
        this.singleRooms = singleRooms;
    }

    public int getApartments() {
        return apartments;
    }

    public void setApartments(int apartments) {
        this.apartments = apartments;
    }

    public int getPenthouse() {
        return penthouse;
    }

    public void setPenthouse(int penthouse) {
        this.penthouse = penthouse;
    }

    public int getNrOfStandardKennels() {
        return nrOfStandardKennels;
    }

    public void setNrOfStandardKennels(int nrOfStandardKennels) {
        this.nrOfStandardKennels = nrOfStandardKennels;
    }

    public int getNrOfPremiumKennels() {
        return nrOfPremiumKennels;
    }

    public void setNrOfPremiumKennels(int nrOfPremiumKennels) {
        this.nrOfPremiumKennels = nrOfPremiumKennels;
    }

    public int getNrOfSpots() {
        return nrOfSpots;
    }

    public void setNrOfSpots(int nrOfSpots) {
        this.nrOfSpots = nrOfSpots;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelServices that = (HotelServices) o;
        if (singleRooms != that.singleRooms) return false;
        if (apartments != that.apartments) return false;
        if (penthouse != that.penthouse) return false;
        if (nrOfStandardKennels != that.nrOfStandardKennels) return false;
        if (nrOfPremiumKennels != that.nrOfPremiumKennels) return false;
        return nrOfSpots == that.nrOfSpots;
    }

    @Override
    public String toString() {
        return "HotelServices{" +
                "singleRooms=" + singleRooms +
                ", apartments=" + apartments +
                ", penthouse=" + penthouse +
                ", nrOfStandardKennels=" + nrOfStandardKennels +
                ", nrOfPremiumKennels=" + nrOfPremiumKennels +
                ", nrOfSpots=" + nrOfSpots +
                '}';
    }

    @Override
    public int hashCode() {
        int result = singleRooms;
        result = 31 * result + apartments;
        result = 31 * result + penthouse;
        result = 31 * result + nrOfStandardKennels;
        result = 31 * result + nrOfPremiumKennels;
        result = 31 * result + nrOfSpots;
        return result;
    }
}

