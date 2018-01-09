package ro.springhotel.hotel.dao;

import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.Room;

import java.util.Collection;

public interface RoomDAO extends BaseDAO<Room>{

    Collection<Client> searchByName(String query);
}