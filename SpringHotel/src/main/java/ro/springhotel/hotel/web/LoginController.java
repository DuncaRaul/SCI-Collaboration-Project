package ro.springhotel.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.LoginInfo;
import ro.springhotel.hotel.service.ClientService;
import ro.springhotel.hotel.service.LoginService;
import ro.springhotel.hotel.service.ValidationException;

import java.util.Collection;

/**
 * @author Raul
 */
@Controller
@RequestMapping("/client/login")
public class LoginController {


    @Autowired
    private ClientService clientService;

    @Autowired
    private LoginService loginService;

    private int index = 0;




    @RequestMapping("/login_invalid")
    public String displayLoginInvalidPage() {
        return "/client/login_invalid";
    }

    @RequestMapping("/login")
    public String loginView() {
        return ("/client/login");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/loginn")
    public String loginView(LoginInfo loginInfo) throws ValidationException {

        loginService.loginSave(loginInfo);

        Collection<LoginInfo> loginList = loginService.listAllLogin();

        Collection<Client> clientList = clientService.listAll();

        boolean usernameCheck = false;
        boolean passwordCheck = false;

        for (LoginInfo login : loginList  ) {
            for (Client client : clientList) {
                if(client.getUserName().equals(login.getUsername())){
                    usernameCheck = true;
                }

                if(client.getPassword().equals(login.getPassword())){
                    passwordCheck = true;
                }
            }
        }


        loginService.deleteLogin(loginInfo.getUsername());

        if (usernameCheck && passwordCheck){
            return "redirect:/homepage_client";
        } else {
            return "redirect:/client/login_invalid";
        }


    }


    @RequestMapping("/register")
    public String registerView() {
        return ("/client/register");
    }

}
