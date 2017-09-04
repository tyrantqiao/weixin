package com.qiao.weixin.repository;

import com.qiao.weixin.data.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by GeoLin on 2017/5/23.
 * TODO May 23th, configure datasource with h2, should change to MySQL
 * August 24th try to finish it
 */
@Repository
public class JdbcUserRepository implements UserRepository {
    private JdbcTemplate jdbcTemplate;

    public JdbcUserRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

//    private jdbcTemplate jdbcTemplate;
//    @Autowired
//    public JdbcUserRepository(jdbcTemplate jdbcTemplate){
//        this.jdbcTemplate=jdbcTemplate;
//    }

    public User save(User user){
        jdbcTemplate.update("insert into weixin.user(username,password,email)"
                                    +"VALUES(?,?,?)",
                                        user.getUsername(),
                                        user.getPassword(),
                                        user.getEmail());
        return user;
    }

    public User findByUsername(String username){
        return jdbcTemplate.queryForObject(
                "select id, username, password, email from weixin.User where username=?",
                new UserRowMapper(),
                username);
        //(A--sql,B--RowMapper,C--supplement for A)
    }

    private class UserRowMapper implements RowMapper<User> {
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            return new User(
                    resultSet.getLong("id"),
                    resultSet.getString("username"),
//                    null,
                    resultSet.getString("password"),
                    resultSet.getString("email"));
        }
    }

}
