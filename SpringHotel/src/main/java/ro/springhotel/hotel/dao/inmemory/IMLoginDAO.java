package ro.springhotel.hotel.dao.inmemory;

import org.springframework.util.StringUtils;
import ro.springhotel.hotel.dao.LoginDAO;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.LoginInfo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Raul
 */
public class IMLoginDAO extends IMBaseDAO<LoginInfo> implements LoginDAO {

    @Override
    public Collection<LoginInfo> searchByName(String query) {
        if (StringUtils.isEmpty(query)) {
            return getAll();
        }

        Collection<LoginInfo> all = new LinkedList<LoginInfo>(getAll());
        for (Iterator<LoginInfo> it = all.iterator(); it.hasNext(); ) {
           LoginInfo loginInfo = it.next();
            String ss = loginInfo.getUsername() + " " + loginInfo.getPassword();
            if (!ss.toLowerCase().contains(query.toLowerCase())) {
                it.remove();
            }
        }
        return all;
    }
}
