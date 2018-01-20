package ro.springhotel.hotel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.dao.UserDAO;
import ro.springhotel.hotel.dao.db.JdbcUserDAO;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.User;

import javax.annotation.security.RolesAllowed;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 * @author Dunca Raul
 * This class enables the validation of login credentials
 */
@Transactional(readOnly = true, value="txn")
@Service
public class UserService {

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(Client.class);

//    @Autowired
//    private UserDAO dao;

    @Autowired
    private JdbcUserDAO jdbcUserDAO;

    @RolesAllowed("ADMIN")
    @Transactional(readOnly = false, value="txn")
    public boolean delete(Long id){
        LOGGER.debug("Deleting client for id: " + id);
        User user = jdbcUserDAO.findById(id);
        if (user != null){
            jdbcUserDAO.delete(user);
            return true;
        }

        return false;
    }

    public User get(Long id) {
        LOGGER.debug("Getting client for id: " + id);
        return jdbcUserDAO.findById(id);
    }

    @Transactional(readOnly = false, value = "txn")
    public void save(User user) throws ValidationException {
        LOGGER.debug("Saving: " + user);
        validate(user);

        jdbcUserDAO.update(user);
    }

    private void validate(User user) throws ValidationException {
        List<String> errors = new LinkedList<String>();

        if (StringUtils.isEmpty(user.getUserName())){
            errors.add("Username is Empty");
        }

        if (StringUtils.isEmpty(user.getPassword())) {
            errors.add("First Name is Empty");
        }

        if (StringUtils.isEmpty(user.getRole())) {
            errors.add("Last Name is Empty");
        }

        //TODO check for id

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toArray(new String[] {}));
        }

    }


    public Boolean validateLogin(String user, String pass) {

        Boolean userCheck = false;
        Boolean passCheck = false;
        Boolean result = false;

        Collection<User> currentUser = jdbcUserDAO.searchByUserName(user);


        for (User u:
             currentUser) {
            if (u.getUserName().equals(user)){
                userCheck = true;
            }
            if (u.getPassword().equals(pass)){
                passCheck = true;
            }

        }

        if (userCheck && passCheck){result = true;}

        return result;
    }




}
