package ro.springhotel.hotel.domain;

import java.util.ArrayList;

/**
 * @author Dani
 */
public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Client> clients;
    private Parking parking;
    private PetCare petCare;
    private int numberOfRooms = 40;


    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public Parking getParking() {
        return parking;
    }

    public PetCare getPetCare() {
        return petCare;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + rooms +
                ", clients=" + clients +
                ", parking=" + parking +
                ", petCare=" + petCare +
                ", numberOfRooms=" + numberOfRooms +
                '}';
    }
}
