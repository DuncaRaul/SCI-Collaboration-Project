package ro.springhotel.hotel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.dao.inmemory.IMClientDAO;
import ro.springhotel.hotel.service.ClientService;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ClientService clientService() {
        ClientService cs = new ClientService();

        cs.setDao(clientDAO());
        return cs;
    }


    @Bean
    public ClientDAO clientDAO() {
        return new IMClientDAO();
    }
}


