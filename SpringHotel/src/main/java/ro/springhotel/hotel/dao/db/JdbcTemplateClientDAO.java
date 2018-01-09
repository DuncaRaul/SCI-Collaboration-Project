package ro.springhotel.hotel.dao.db;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ro.springhotel.hotel.dao.ClientDAO;
import ro.springhotel.hotel.domain.Client;
import ro.springhotel.hotel.domain.Gender;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Date;

public class JdbcTemplateClientDAO implements ClientDAO{

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplateClientDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Collection<Client> searchByName(String query) {
        return jdbcTemplate.query("select * from client "
                        + "where lower(first_name || ' ' || last_name) like '%?%'",
                new String[]{query.toLowerCase()},
                new ClientMapper());
    }

    @Override
    public Collection<Client> getAll() {
        return jdbcTemplate.query("select * from client",
                new ClientMapper());
    }

    @Override
    public Client findById(long id) {
        return jdbcTemplate.queryForObject("select * from client where id = ?",

                new ClientMapper(), id);
    }

    @Override
    public Client update(Client model) {

        String sql = "";
        Long newId = null;
        if (model.getId() > 0) {
            sql = "update client set first_name=?, last_name=?, birth_date=?, gender = ? "
                    + "where id = ? returning id";
            newId = jdbcTemplate.queryForObject(sql, new Object[]{
                    model.getFirstName(),
                    model.getLastName(),
                    new Timestamp(model.getBirthDate().getTime()),
                    model.getGender().name(),
                    model.getId()

            }, new RowMapper<Long>() {
                public Long mapRow(ResultSet rs, int arg1) throws SQLException {
                    return rs.getLong(1);
                }
            });
        } else {
            sql = "insert into client (first_name, last_name, birth_date, gender) "
                    + "values (?, ?, ?, ?) returning id";

            newId = jdbcTemplate.queryForObject(sql, new Object[]{
                    model.getFirstName(),
                    model.getLastName(),
                    new Timestamp(model.getBirthDate().getTime()),
                    model.getGender().name()

            }, new RowMapper<Long>() {
                public Long mapRow(ResultSet rs, int arg1) throws SQLException {
                    return rs.getLong(1);
                }
            });
        }
        model.setId(newId);

        return model;
    }

    @Override
    public boolean delete(Client model) {
        return jdbcTemplate.update("delete from client where id = ?", model.getId()) > 0;
    }

    private static class ClientMapper implements RowMapper<Client> {

        @Override
        public Client mapRow(ResultSet rs, int arg1) throws SQLException {
            Client client = new Client();
            client.setId(rs.getLong("id"));
            client.setFirstName(rs.getString("first_name"));
            client.setLastName(rs.getString("last_name"));
            client.setBirthDate(new Date(rs.getTimestamp("birth_date").getTime()));
            client.setGender(Gender.valueOf(rs.getString("gender")));
            return client;
        }

    }
}
