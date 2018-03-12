package ro.springhotel.hotel.service;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.dao.LoginDAO;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.LoginInfo;
import ro.springhotel.hotel.domain.Room;

/**
 * @author Raul
 */
public class ClientService {
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);

    private ClientDAO dao;


    public Collection<Client> listAll() {
        return dao.getAll();
    }

    public Collection<Client> search(String query) {
        LOGGER.debug("Searching for " + query);
        return dao.searchByName(query);
    }

    public boolean delete(Long id) {
        LOGGER.debug("Deleting client for id: " + id);
        Client client = dao.findById(id);
        if (client != null) {
            dao.delete(client);
            return true;
        }

        return false;
    }

    public Client get(Long id) {
        LOGGER.debug("Getting client for id: " + id);
        return dao.findById(id);

    }

    public void save(Client client) throws ValidationException {
        LOGGER.debug("Saving: " + client);
        validate(client);

        dao.update(client);
    }


    private void validate(Client client) throws ValidationException {
        Date currentDate = new Date();
        List<String> errors = new LinkedList<String>();
        if (StringUtils.isEmpty(client.getFirstName())) {
            errors.add("First Name is Empty");
        }

        if (StringUtils.isEmpty(client.getLastName())) {
            errors.add("Last Name is Empty");
        }

        if (client.getGender() == null) {
            errors.add("Gender is Empty");
        }

        if (client.getBirthDate() == null) {
            errors.add("BirthDate is Empty");
        } else {
            if (currentDate.before(client.getBirthDate())) {
                errors.add("Birthdate in future");
            }

            Calendar c = GregorianCalendar.getInstance();
            c.setTime(new Date());
            c.set(Calendar.YEAR, c.get(Calendar.YEAR) - 18);
            if (client.getBirthDate().after(c.getTime())) {
                errors.add("Too young to reserve a room");
            }

        }


        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toArray(new String[]{}));
        }
    }


    public ClientDAO getDao() {
        return dao;
    }

    public void setDao(ClientDAO dao) {
        this.dao = dao;
    }


}
