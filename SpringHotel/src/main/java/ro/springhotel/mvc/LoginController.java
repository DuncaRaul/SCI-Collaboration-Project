package ro.springhotel.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView("auth/login");

        return modelAndView;
    }

    @RequestMapping(value = "/acces-denied", method = RequestMethod.GET)
    public ModelAndView accesDenied() {
        ModelAndView modelAndView = new ModelAndView("auth/acces-denied");

        return modelAndView;
    }

    @RequestMapping("/onLogin")
    public ModelAndView onLogin(String userName, String pass, HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        UserService userService = new UserService();
        //use UserService to check the login
        boolean loginWithSucces = true;
        loginWithSucces = userService.validateLogin(userName,pass);
        if (loginWithSucces) {
            Client client = new Client();
            client.setUserName(userName);

            request.getSession().setAttribute("currentClient", client);
            modelAndView.setView(new RedirectView("/client"));
        }

        return modelAndView;
    }

    @RequestMapping("/logout")
    public String onLogout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "/";
    }



}
