package ro.springhotel.hotel.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.service.ClientService;
import ro.springhotel.hotel.service.ValidationException;

import java.util.Collection;

    @Controller
    @RequestMapping("/client")
    public class ClientController {

        @Autowired
        private ClientService clientService;

        private int index = 1;

        @RequestMapping("")
        public ModelAndView list()  throws ValidationException {
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
        public String saveClient(Client client) throws ValidationException{

            clientService.save(client);

            return "redirect:/client";
        }

        @RequestMapping("/add")
        public String displayAddPage() {
            return "/client/add_client";
        }
    }
