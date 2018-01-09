package ro.springhotel.hotel.dao.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.Gender;

import java.sql.*;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Dani
 */
public class JdbcHotelDAO implements ClientDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(JdbcHotelDAO.class);

    private String host;
    private String port;
    private String dbName;
    private String userName;
    private String pass;




    public JdbcHotelDAO(String host, String port, String dbName, String userName, String pass) {
        this.host = host;
        this.userName = userName;
        this.pass = pass;
        this.port = port;
        this.dbName = dbName;
    }



    @Override
    public Collection<Client> searchByName(String query) {
        if (query == null) {
            query = "";
        } else {
            query = query.trim();
        }

        Connection connection = newConnection();

        Collection<Client> result = new LinkedList<>();

        try (ResultSet rs = connection.createStatement()
                .executeQuery("select * from client "
                        + "where lower(first_name || ' ' || last_name) like '%"
                        + query.toLowerCase() + "%'")) {

            while (rs.next()) {
                result.add(extractClient(rs));
            }
            connection.commit();
        } catch (SQLException ex) {

            throw new RuntimeException("Error getting clients.", ex);
        }

        return result;
    }

    @Override
    public Collection<Client> getAll() {

        Collection<Client> result = new LinkedList<>();

        try (Connection connection = newConnection();
             ResultSet rs = connection.createStatement()
                     .executeQuery("select * from client")) {

            while (rs.next()) {
                result.add(extractClient(rs));
            }
            connection.commit();
        } catch (SQLException ex) {

            throw new RuntimeException("Error getting clients.", ex);
        }

        return result;
    }

    @Override
    public Client findById(long id) {
        Connection connection = newConnection();

        List<Client> result = new LinkedList<>();

        try (ResultSet rs = connection.createStatement()
                .executeQuery("select * from client where id = " + id)) {

            while (rs.next()) {
                result.add(extractClient(rs));
            }
            connection.commit();
        } catch (SQLException ex) {

            throw new RuntimeException("Error getting client.", ex);
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {

            }
        }

        if (result.size() > 1) {
            throw new IllegalStateException("Multiple Clients for id: " + id);
        }
        return result.isEmpty() ? null : result.get(0);
    }


    @Override
    public Client update(Client model) {
        Connection connection = newConnection();
        try {
            PreparedStatement ps = null;
            if (model.getId() > 0) {
                ps = connection.prepareStatement(
                        "update client set first_name=?, last_name=?, birth_date=?, gender = ? "
                                + "where id = ? returning id");

            } else {

                ps = connection.prepareStatement(
                        "insert into employee (first_name, last_name, birth_date, gender) "
                                + "values (?, ?, ?, ?) returning id");

            }
            ps.setString(1, model.getFirstName());
            ps.setString(2, model.getLastName());
            ps.setTimestamp(3, new Timestamp(model.getBirthDate().getTime()));
            ps.setString(4, model.getGender().name());

            if (model.getId() > 0) {
                ps.setLong(5, model.getId());
            }

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                model.setId(rs.getLong(1));
            }
            rs.close();

            connection.commit();

        } catch (SQLException ex) {

            throw new RuntimeException("Error getting clients.", ex);
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {

            }
        }

        return model;
    }

    @Override
    public boolean delete(Client model) {
        boolean result = false;
        Connection connection = newConnection();
        try {
            Statement statement = connection.createStatement();
            result = statement.execute("delete from employee where id = " + model.getId());
            connection.commit();
        } catch (SQLException ex) {

            throw new RuntimeException("Error updating employees.", ex);
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {

            }
        }
        return result;
    }

    protected Connection newConnection() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();

            String url = new StringBuilder()
                    .append("jdbc:")
                    .append("postgresql")
                    .append("://")
                    .append(host)
                    .append(":")
                    .append(port)
                    .append("/")
                    .append(dbName)
                    .append("?user=")
                    .append(userName)
                    .append("&password=")
                    .append(pass).toString();
            Connection result = DriverManager.getConnection(url);
            result.setAutoCommit(false);

            return result;
        } catch (Exception ex) {
            throw new RuntimeException("Error getting DB connection", ex);
        }

    }

    private Client extractClient(ResultSet rs) throws SQLException {
        Client client = new Client();
        client.setId(rs.getLong("id"));
        client.setFirstName(rs.getString("first_name"));
        client.setLastName(rs.getString("last_name"));
        client.setBirthDate(new java.util.Date(rs.getTimestamp("birth_date").getTime()));
        client.setGender(Gender.valueOf(rs.getString("gender")));
        return client;

    }
}
