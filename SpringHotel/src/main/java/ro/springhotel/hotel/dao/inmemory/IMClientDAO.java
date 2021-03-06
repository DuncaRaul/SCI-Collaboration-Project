package ro.springhotel.hotel.dao.inmemory;

import org.springframework.util.StringUtils;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.domain.Client;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IMClientDAO extends IMBaseDAO<Client> implements ClientDAO {


    public Collection<Client> searchByName(String query) {
        if (StringUtils.isEmpty(query)) {
            return getAll();
        }

        Collection<Client> all = new LinkedList<Client>(getAll());
        for (Iterator<Client> it = all.iterator(); it.hasNext(); ) {
            Client client = it.next();
            String ss = client.getFirstName() + " " + client.getLastName();
            if (!ss.toLowerCase().contains(query.toLowerCase())) {
                it.remove();
            }
        }
        return all;
    }


}