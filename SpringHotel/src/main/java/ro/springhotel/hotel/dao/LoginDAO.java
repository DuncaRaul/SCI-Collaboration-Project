package ro.springhotel.hotel.dao;

import ro.springhotel.hotel.domain.LoginInfo;

import java.util.Collection;

/**
 * @author Raul
 */
public interface LoginDAO extends BaseDAO<LoginInfo> {

    Collection<LoginInfo> searchByName(String query);
}
