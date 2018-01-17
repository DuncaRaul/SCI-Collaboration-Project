package ro.springhotel.hotel.dao.db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ro.springhotel.hotel.dao.UserDAO;
import ro.springhotel.hotel.domain.User;

import java.sql.*;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class JdbcUserDAO implements UserDAO {

    private static final Logger LOGGER = LoggerFactory.getLogger(JdbcUserDAO.class);

    private String host;
    private String port;
    private String dbName;
    private String userName;
    private String pass;

    public JdbcUserDAO(String host, String port, String dbName, String userName, String pass) {
        this.host = host;
        this.port = port;
        this.dbName = dbName;
        this.userName = userName;
        this.pass = pass;
    }

    @Override
    public Collection<User> searchByUserName(String query) {
        if (query == null) {
            query = "";
        } else {
            query = query.trim();
        }

        Connection connection = newConnection();

        Collection<User> result = new LinkedList<>();

        try (ResultSet rs = connection.createStatement()
                .executeQuery("select * from user_clients "
                        + "where lower(user_name) like '%"
                        + query.toLowerCase() + "%'")) {

            while (rs.next()) {
                result.add(extractUser(rs));
            }
            connection.commit();
        } catch (SQLException ex) {

            throw new RuntimeException("Error getting users.", ex);
        }

        return result;
    }

//    private Boolean loginWithSucces(String userName, String password) {
//        Boolean result = false;
//
//        try (Connection connection = newConnection();
//             ResultSet rs = connection.createStatement()
//                     .executeQuery("select user_name password from users where user_name = " + userName)) {
//            result = true;
//        } catch (SQLException ex) {
//            throw new RuntimeException("Invalid username or password.", ex);
//        }
//
//        return result;
//
//    }

    @Override
    public Collection<User> getAll() {
        Collection<User> result = new LinkedList<>();

        try (Connection connection = newConnection();
             ResultSet rs = connection.createStatement()
                     .executeQuery("select * from user_clients")) {

            while (rs.next()) {
                result.add(extractUser(rs));
            }
            connection.commit();
        } catch (SQLException ex) {

            throw new RuntimeException("Error getting users.", ex);
        }

        return result;
    }

    @Override
    public User findById(long id) {
        Connection connection = newConnection();

        List<User> result = new LinkedList<>();

        try (ResultSet rs = connection.createStatement()
                .executeQuery("select * from user_clients where id = " + id)) {

            while (rs.next()) {
                result.add(extractUser(rs));
            }
            connection.commit();
        } catch (SQLException ex) {

            throw new RuntimeException("Error getting user.", ex);
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {

            }
        }

        if (result.size() > 1) {
            throw new IllegalStateException("Multiple Users for id: " + id);
        }
        return result.isEmpty() ? null : result.get(0);
    }

    @Override
    public User update(User model) {
        Connection connection = newConnection();
        try {
            PreparedStatement ps = null;
            if (model.getId() > 0) {
                ps = connection.prepareStatement(
                        "update user_clients set user_name=?, password=?, role = ? "
                                + "where id = ? returning id");

            } else {

                ps = connection.prepareStatement(
                        "insert into user_clients (user_name, password, role) "
                                + "values (?, ?, ?, ?) returning id" );

            }
            ps.setString(1, model.getUserName());
            ps.setString(2, model.getPassword());
            ps.setString(3, model.getRole());

            if (model.getId() > 0) {
                ps.setLong(4, model.getId());
            }

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                model.setId(rs.getLong(1));
            }
            rs.close();

            connection.commit();

        } catch (SQLException ex) {

            throw new RuntimeException("Error getting users.", ex);
        } finally {
            try {
                connection.close();
            } catch (Exception ex) {

            }
        }

        return model;
    }

    @Override
    public boolean delete(User model) {
        boolean result = false;
        Connection connection = newConnection();
        try {
            Statement statement = connection.createStatement();
            result = statement.execute("delete from user_clients where id = " + model.getId());
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

    private User extractUser(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getLong("id"));
        user.setUserName(rs.getString("user_name"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        return user;

    }
}
