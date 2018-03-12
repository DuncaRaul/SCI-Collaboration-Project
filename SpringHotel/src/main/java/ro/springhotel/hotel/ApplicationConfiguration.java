package ro.springhotel.hotel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.springhotel.hotel.dao.BookingDAO;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.dao.LoginDAO;
import ro.springhotel.hotel.dao.inmemory.IMBookingDAO;
import ro.springhotel.hotel.dao.inmemory.IMClientDAO;
import ro.springhotel.hotel.dao.inmemory.IMLoginDAO;
import ro.springhotel.hotel.service.ClientService;
import ro.springhotel.hotel.service.LoginService;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public ClientService clientService() {
        ClientService cs = new ClientService();

        cs.setDao(clientDAO());
        return cs;
    }

    @Bean
    public LoginService loginService() {
        LoginService ls = new LoginService();

        ls.setDao(loginDAO());
        return ls;
    }

    @Bean
    public LoginService loginServices() {return new LoginService();}

    @Bean
    public ClientDAO clientDAO() {
        return new IMClientDAO();
    }

    @Bean
    public LoginDAO loginDAO() {return  new IMLoginDAO();}

    @Bean
    public BookingDAO bookingDAO() {return new IMBookingDAO();}
}


