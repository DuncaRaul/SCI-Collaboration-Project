package ro.springhotel.hotel.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.dao.LoginDAO;
import ro.springhotel.hotel.domain.LoginInfo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LoginService {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginService.class);

    private LoginDAO loginDAO;

    public Collection<LoginInfo> listAllLogin() {
        return loginDAO.getAll();
    }


    public boolean deleteLogin(String username) {
        LOGGER.debug("Deleting client login for username" + username);

        Collection<LoginInfo> loginInfos = loginDAO.searchByName(username);
        LoginInfo li = new LoginInfo();

        for (LoginInfo loginInfo:loginInfos ) {

            li = loginInfo;
        }

        LoginInfo loginInfo = li;
        if (loginInfo != null) {
            loginDAO.delete(loginInfo);
            return true;
        }else{
            return  false;
        }

    }

    public void loginSave(LoginInfo loginInfo) throws ValidationException {
        LOGGER.debug("Saving: " + loginInfo);
        validateLogin(loginInfo);

        loginDAO.update(loginInfo);
    }

    private void validateLogin(LoginInfo loginInfo) throws ValidationException {

        List<String> errors = new LinkedList<String>();

        if (StringUtils.isEmpty(loginInfo.getUsername())) {
            errors.add("Username is Empty");
        }

        if (StringUtils.isEmpty(loginInfo.getPassword())) {
            errors.add("Password is Empty");
        }

        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toArray(new String[]{}));
        }
    }

    public void setDao(LoginDAO dao) {this.loginDAO = dao;
    }
}
