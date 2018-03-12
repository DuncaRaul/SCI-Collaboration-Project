package ro.springhotel.hotel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import ro.springhotel.hotel.dao.BookingDAO;
import ro.springhotel.hotel.dao.LoginDAO;
import ro.springhotel.hotel.domain.Booking;
import ro.springhotel.hotel.domain.LoginInfo;

import java.util.*;

public class BookingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookingService.class);

    private BookingDAO bookingDAO;
    Date currentDate = new Date();

    public Collection<Booking> listAllBooking() {
        return bookingDAO.getAll();
    }

    public boolean deleteLogin(String email) {
        LOGGER.debug("Deleting client login for username" + email);

        Collection<Booking> bookings = bookingDAO.searchByName(email);
        Booking bo = new Booking();

        for (Booking booking:bookings ) {

            bo = booking;
        }

        Booking booking = bo;
        if (booking != null) {
            bookingDAO.delete(booking);
            return true;
        }else{
            return  false;
        }

    }

    public void bookingSave(Booking booking) throws ValidationException {
        LOGGER.debug("Saving: " + booking);
        validateBooking(booking);

        bookingDAO.update(booking);
    }

    private void validateBooking(Booking booking) throws ValidationException {

        List<String> errors = new LinkedList<String>();

        if (StringUtils.isEmpty(booking.getName())) {
            errors.add("Username is Empty");
        }

        if (StringUtils.isEmpty(booking.getEmail())) {
            errors.add("Email is Empty");
        }

        if (StringUtils.isEmpty(booking.getPhoneNumber())) {
            errors.add("Phone number is Empty");
        }

        if (booking.getCheckIn() == null) {
            errors.add("Check in date is Empty");
        } else {
            if (currentDate.after(booking.getCheckIn())) {
                errors.add("Check in date is in the past");
            }

        }

        if (booking.getCheckOut() == null) {
            errors.add("Check out date is Empty");
        } else {
            if (currentDate.after(booking.getCheckIn())) {
                errors.add("Check out date is in the past");
            }

            if (booking.getCheckOut().before(booking.getCheckIn())){
                errors.add("Check out date is before check in date");
            }

        }



        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toArray(new String[]{}));
        }
    }

    public void setDao(BookingDAO dao) {this.bookingDAO = dao;
    }

}
