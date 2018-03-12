package ro.springhotel.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.springhotel.hotel.service.ValidationException;

/**
 * @author Raul
 */
@Controller
@RequestMapping("/homepage")
public class HomepageController {


    @RequestMapping("")
    public String homepageView() {

        return "/homepage";
    }

    @RequestMapping("/register")
    public String registerView() {

        return "/register";
    }

    @RequestMapping("/contact")
    public String contactView() {
        return "/contact";
    }

    @RequestMapping("/booking")
    public String bookingView() {
        return "/booking";
    }

    @RequestMapping("/details")
    public String detailsView() {
        return "/details";
    }

    @RequestMapping("/facilities")
    public String facilitiesView() {
        return "/facilities";
    }


}


