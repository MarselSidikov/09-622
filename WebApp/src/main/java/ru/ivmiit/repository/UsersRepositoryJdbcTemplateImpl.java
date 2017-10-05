package ru.ivmiit.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ru.ivmiit.models.User;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 05.10.2017
 * UsersRepositoryJdbcTemplateImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class UsersRepositoryJdbcTemplateImpl implements UsersRepository {

    private JdbcTemplate jdbcTemplate;

    public UsersRepositoryJdbcTemplateImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    //language=SQL
    private static final String SQL_SELECT_ALL =
            "SELECT * FROM student";

    //language=SQL
    private static final String SQL_SELECT_BY_AGE =
            "SELECT * FROM student WHERE age = ?";

    private RowMapper<User> rowMapper = (rs, rowNum) ->
            User.builder()
            .id(rs.getLong("id"))
            .name(rs.getString("name"))
            .age(rs.getInt("age"))
            .build();

    /*
    private RowMapper<User> rowMapperAnon = new RowMapper<User>() {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            return User
                    .builder()
                    .id(rs.getLong("id"))
                    .name(rs.getString("name"))
                    .age(rs.getInt("age"))
                    .build();
        }
    };
    */

    public List<User> findAllByAge(int age) {
        return jdbcTemplate.query(SQL_SELECT_BY_AGE,
                rowMapper, age);
    }

    public List<User> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL,
                rowMapper);
    }

    public void save(User model) {

    }

    public void delete(Long id) {

    }

    public void update(User model) {

    }

    public User find(Long id) {
        return null;
    }
}
