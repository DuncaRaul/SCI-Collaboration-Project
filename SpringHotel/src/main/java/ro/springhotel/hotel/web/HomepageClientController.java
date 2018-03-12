package ro.springhotel.hotel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ro.springhotel.hotel.service.HotelServices;

/**
 * @author Raul
 */
@Controller
@RequestMapping("/homepage_client")
public class HomepageClientController {

    @RequestMapping("")
    public String homepageView() {

        return "/homepage_client";
    }

    @RequestMapping("/booking_client")
    public String bookingClientView() {
        return "/booking_client";
    }

    @RequestMapping("/contact_client")
    public String contactClientView() {
        return "/contact_client";
    }

    @RequestMapping("/details_client")
    public String detailsClientView() {
        return "/details_client";
    }

    @RequestMapping("/facilities_client")
    public String facilitiesClientView() {
        return "/facilities_client";
    }


    private HotelServices hotelServices = new HotelServices(40, 60, 1, 50, 20, 120);

    @RequestMapping(method = RequestMethod.POST, value = "/reserve")
    public String reserveRoom(int i) {

        hotelServices.reserveKennel(i);


        return "redirect:/homepage";
    }
}
