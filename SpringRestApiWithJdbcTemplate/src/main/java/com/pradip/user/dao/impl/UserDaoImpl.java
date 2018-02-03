package com.pradip.user.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pradip.pojo.User;
import com.pradip.user.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int createUser(User user) {
		int count = this.jdbcTemplate.update("INSERT INTO USER(first_name, last_name) VALUES(?,?)",
				new Object[] { user.getFirstName(), user.getLastName() });
		return count;
	}

	@Override
	public List<User> findAllUsers() {
		List<User> users = null;
		try {
			users = this.jdbcTemplate.query("SELECT * FROM USER ", new BeanPropertyRowMapper<User>(User.class));
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		return users;
	}

}