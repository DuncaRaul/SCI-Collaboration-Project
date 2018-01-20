package ro.springhotel.hotel.dao;

import ro.springhotel.hotel.domain.Client;

import java.util.Collection;

public interface ClientDAO extends BaseDAO<Client>{

    Collection<Client> searchByName(String query);
}
