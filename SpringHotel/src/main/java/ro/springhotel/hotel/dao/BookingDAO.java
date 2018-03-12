package ro.springhotel.hotel.dao;

import ro.springhotel.hotel.domain.Booking;
import ro.springhotel.hotel.domain.LoginInfo;

import java.util.Collection;

/**
 * @author Raul
 */
public interface BookingDAO extends BaseDAO<Booking> {

    Collection<Booking> searchByName(String query);
}
