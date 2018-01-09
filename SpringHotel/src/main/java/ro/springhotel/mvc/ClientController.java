package ro.springhotel.mvc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.service.ClientService;
import org.springframework.validation.BindingResult;
import ro.springhotel.hotel.service.Monitoring;
import org.springframework.web.servlet.ModelAndView;
import ro.springhotel.hotel.service.ValidationException;

import javax.validation.Valid;
import javax.validation.Validation;
import java.util.Collection;
import java.util.List;
import java.util.LinkedList;

@Controller
@RequestMapping("/client")
public class ClientController {

    private static Logger LOGGER = LoggerFactory.getLogger("ClientController");

    @Autowired
    private ClientService clientService;

    @RequestMapping("")
    @Monitoring
    public ModelAndView list() {
        ModelAndView result = new ModelAndView("client/list");

        Collection<Client> clients = clientService.listAll();
        result.addObject("clients" , clients);

        return result;
    }

    @RequestMapping("/add")
    public ModelAndView add() {
        ModelAndView modelAndView = new ModelAndView("client/add");
        modelAndView.addObject("client", new Client());
        return modelAndView;
    }

    @RequestMapping("/edit")
    public ModelAndView edit(long id){
        Client client = clientService.get(id);
        ModelAndView modelAndView = new ModelAndView("client/edit");
        modelAndView.addObject("client", client);
        return modelAndView;
    }

    @RequestMapping("/delete")
    public String delete(long id){
        clientService.delete(id);
        return "redirect:/client";
    }

    @RequestMapping("/save")
    public ModelAndView save (@Valid Client client, BindingResult bindingResult){
        ModelAndView modelAndView = new ModelAndView();
        if (!bindingResult.hasErrors()){
            try{
                clientService.save(client);
                RedirectView redirectView = new RedirectView("/client");
                modelAndView.setView(redirectView);
            }catch (ValidationException ex){
                LOGGER.error("validation error", ex);

                List<String> errors = new LinkedList<>();
                errors.add(ex.getMessage());
                modelAndView = new ModelAndView("client/add");
                modelAndView.addObject("errors", errors);
                modelAndView.addObject("client", client);
            }
        }else{
            List<String> errors = new LinkedList<>();

            for (FieldError error :
                    bindingResult.getFieldErrors()){
                errors.add(error.getField() + ";" + error.getCode());
            }

            modelAndView = new ModelAndView("client/add");
            modelAndView.addObject("errors", errors);
            modelAndView.addObject("client", client);

        }

        return modelAndView;
    }



}
