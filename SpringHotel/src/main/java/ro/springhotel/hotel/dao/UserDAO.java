package ro.springhotel.hotel.dao;

import ro.springhotel.hotel.domain.User;

import java.util.Collection;

public interface UserDAO extends BaseDAO<User> {
    Collection<User> searchByUserName(String query);
}
