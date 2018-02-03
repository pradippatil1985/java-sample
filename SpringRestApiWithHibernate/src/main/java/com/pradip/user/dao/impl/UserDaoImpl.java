package com.pradip.user.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pradip.pojo.User;
import com.pradip.user.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public int createUser(User user) {

		Session session = this.sessionFactory.getCurrentSession();

		session.saveOrUpdate(user);

		return 1;
	}

	@Override
	public List<User> findAllUsers() {
		return getAllDummyUsers();
	}

	private List<User> getAllDummyUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		MultiIdentifierLoadAccess<User> multiLoadAccess = session.byMultipleIds(User.class);

		List<User> users = null;

		List<Long> ids = new ArrayList<Long>();
		for (long i = 1; i < 5; i++) {
			ids.add(i);
		}
		users = multiLoadAccess.multiLoad(ids);

		return users;
	}

}