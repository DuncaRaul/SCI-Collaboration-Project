package ro.springhotel.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import ro.springhotel.hotel.service.BookingService;

/**
 * @author Raul
 */
public class BookingController {

    @Autowired
    private BookingService bookingService;
}
