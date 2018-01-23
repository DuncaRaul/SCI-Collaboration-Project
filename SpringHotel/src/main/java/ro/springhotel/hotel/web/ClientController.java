package ro.springhotel.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.service.ClientService;
import ro.springhotel.hotel.service.HotelServices;
import ro.springhotel.hotel.service.ValidationException;

import java.util.Collection;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    private int index = 0;

    @RequestMapping("")
    public ModelAndView list() throws ValidationException {
        ModelAndView result = new ModelAndView("client/list");


        Collection<Client> clientList = clientService.listAll();


        result.addObject("clients", clientList);

        return result;
    }


    @RequestMapping("/edit")
    public ModelAndView editClient(long id) {

        ModelAndView result = new ModelAndView("/client/edit_client");
        result.addObject("client", clientService.get(id));
        return result;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public String saveClient(Client client) throws ValidationException {

        clientService.save(client);

        return "redirect:/homepage";
    }

    @RequestMapping("/add")
    public String displayAddPage() {
        return "/client/add_client";
    }

    @RequestMapping("/login_invalid")
    public String displayLoginInvalidPage() {
        return "/client/login_invalid";
    }

    @RequestMapping("/login")
    public String loginView() {
        return ("/client/login");
    }

    @RequestMapping(method = RequestMethod.POST, value = "/loginn")
    public String loginnView(Client client) throws ValidationException {

        clientService.save(client);

        Collection<Client> clientList = clientService.listAll();


        String user = "a";
        String password = "b";
        boolean dani = false;
        long id = 0;


        for (Client client2 : clientList) {
            if (client2.getFirstName().equals("caca")) {
                user = client2.getUserName();
                password = client2.getPassword();
                id = client2.getId();

            }
        }

        clientService.delete(id);

        Collection<Client> clientList2 = clientService.listAll();

        for (Client client2 : clientList2) {
            if ((client2.getUserName().equals(user)) && (client2.getPassword().equals(password))) {
                dani = true;
            }
            System.out.println(client2.getId());
        }


        if (dani) {
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
