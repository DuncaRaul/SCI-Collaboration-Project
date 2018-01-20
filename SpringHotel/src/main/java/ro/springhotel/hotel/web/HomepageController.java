package ro.springhotel.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ro.springhotel.hotel.service.ValidationException;

@Controller
    @RequestMapping("/homepage")
    public class HomepageController {

        @RequestMapping("")
    public ModelAndView view() {
            ModelAndView result = new ModelAndView("/home");
            return result;
        }

    }


