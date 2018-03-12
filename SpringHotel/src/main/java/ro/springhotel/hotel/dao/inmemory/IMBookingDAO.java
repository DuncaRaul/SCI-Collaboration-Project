package ro.springhotel.hotel.dao.inmemory;

import org.springframework.util.StringUtils;
import ro.springhotel.hotel.dao.BookingDAO;
import ro.springhotel.hotel.domain.Booking;
import ro.springhotel.hotel.domain.LoginInfo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IMBookingDAO extends IMBaseDAO<Booking> implements BookingDAO {

    @Override
    public Collection<Booking> searchByName(String query) {
        if (StringUtils.isEmpty(query)) {
            return getAll();
        }

        Collection<Booking> all = new LinkedList<Booking>(getAll());
        for (Iterator<Booking> it = all.iterator(); it.hasNext(); ) {
            Booking booking = it.next();
            String ss = booking.getName() + " " + booking.getEmail() + " " + booking.getPhoneNumber() + " " + booking.getHasParking()
                    + " " + booking.getHasPetCare() + " " + booking.getCheckIn() + " " + booking.getCheckOut() + " " + booking.getNumberOfPeople()
                    + " " + booking.getAdditionalInformation();
            if (!ss.toLowerCase().contains(query.toLowerCase())) {
                it.remove();
            }
        }
        return all;
    }
}
