package ro.springhotel.hotel.dao.db;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ro.springhotel.hotel.dao.UserDAO;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.Gender;
import ro.springhotel.hotel.domain.User;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Date;

public class JdbcTemplateUserDao implements UserDAO {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplateUserDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Collection<User> searchByUserName(String query) {
        return jdbcTemplate.query("select * from user_clients "
                        + "where lower(user_name || ' ' || password) like '%?%'",
                new String[]{query.toLowerCase()},
                new JdbcTemplateUserDao.UserMapper());
    }

    @Override
    public Collection<User> getAll() {
        return jdbcTemplate.query("select * from user_clients",
                new JdbcTemplateUserDao.UserMapper());
    }

    @Override
    public User findById(long id) {
        return jdbcTemplate.queryForObject("select * from user_clients where id = ?",

                new JdbcTemplateUserDao.UserMapper(), id);
    }

    @Override
    public User update(User model) {
        return null;
    }

    @Override
    public boolean delete(User model) {
        return false;
    }

    private static class UserMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet rs, int arg1) throws SQLException {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setUserName(rs.getString("user_name"));
            user.setPassword(rs.getString("password"));
            user.setRole(rs.getString("role"));
            return user;
        }

    }
}
