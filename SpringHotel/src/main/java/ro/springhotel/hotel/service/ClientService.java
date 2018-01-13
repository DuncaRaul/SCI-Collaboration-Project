package ro.springhotel.hotel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ro.springhotel.hotel.dao.inmemory.IMClientDAO;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.domain.Client;

import java.util.*;

import org.springframework.util.StringUtils;

import javax.annotation.security.RolesAllowed;
import javax.validation.executable.ValidateOnExecution;


/**
 * ClientService is the class that holds all the services used only by the Client, which
 * allows the application to call methods specific to the Client, based on Model-View-Controller
 * pattern;
 *
 * @author Raul Dunca
 */

@Transactional(readOnly = true, value="txn")
@Service
public class ClientService {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Client.class);


    @Autowired
    private ClientDAO dao;


    public Collection<Client> listAll() {
        return dao.getAll();
    }

    public Collection<Client> search( String query) {
        LOGGER.debug("Searching for " + query);
        return dao.searchByName(query);
    }

    @RolesAllowed("ADMIN")
    @Transactional(readOnly = false, value="txn")
    public boolean delete(Long id){
        LOGGER.debug("Deleting client for id: " + id);
        Client client = dao.findById(id);
        if (client != null){
            dao.delete(client);
            return true;
        }

        return false;
    }

    public Client get(Long id) {
        LOGGER.debug("Getting client for id: " + id);
        return dao.findById(id);
    }

    @Transactional(readOnly = false, value = "txn")
    public void save(Client client) throws ValidationException {
        LOGGER.debug("Saving: " + client);
        validate(client);

        dao.update(client);
    }

    private void validate(Client client) throws ValidationException {
        Date currentDate = new Date();
        List<String> errors = new LinkedList<String>();

        if (StringUtils.isEmpty(client.getUserName())){
            errors.add("Username is Empty");
        }

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
            errors.add("Birthday is Empty");
        } else {
            if (currentDate.before(client.getBirthDate())){
                errors.add("Birthday in future");
            }

            Calendar c = GregorianCalendar.getInstance();
            c.setTime(new Date());
            c.set(Calendar.YEAR, c.get(Calendar.YEAR) - 18);
            if (client.getBirthDate().after(c.getTime())) {
                errors.add("Too young to make an account");
            }
        }

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toArray(new String[] {}));
        }

    }

    public ClientDAO getDao() {
        return dao;
    }

    public void setDao (ClientDAO dao) { this.dao = dao;}
}
