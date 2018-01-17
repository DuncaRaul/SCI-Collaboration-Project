package ro.springhotel.hotel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SingleConnectionDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ro.springhotel.hotel.dao.ClientDAO;

import ro.springhotel.hotel.dao.UserDAO;
import ro.springhotel.hotel.dao.db.JdbcTemplateClientDAO;
import ro.springhotel.hotel.dao.db.JdbcTemplateUserDao;
import ro.springhotel.hotel.service.ClientService;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
public class ApplicationConfiguration implements TransactionManagementConfigurer{

    @Value("${db.host}")
    private String dbHost;

    @Value("${db.password}")
    private String dbPassword;

    @Value("${db.user}")
    private String dbUser;


    @Value("${db.name}")
    private String dbName;

    @Bean
    public ClientService clientService() {
        ClientService hotel = new ClientService();

        hotel.setDao(clientDAO());
        return hotel;
    }

    @Bean
    public ClientDAO clientDAO() {
        return new JdbcTemplateClientDAO(dataSource());
    }

    @Bean
    public UserDAO userDAO() {
        return new JdbcTemplateUserDao(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        String url = new StringBuilder()
                .append("jdbc:")
                .append("postgresql")
                .append("://localhost")
                .append(dbHost)
                .append(":")
                .append("5432")
                .append("/SpringHotel")
                .append(dbName)
                .append("?user=postgres")
                .append(dbUser)
                .append("&password=postgres")
                .append(dbPassword).toString();

        return  new SingleConnectionDataSource(url, false);
    }


    @Bean(name="txn")
    public DataSourceTransactionManager txName() {
        return new DataSourceTransactionManager(dataSource());
    }


    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return txName();
    }


    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
