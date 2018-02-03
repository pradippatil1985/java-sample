package com.pradip.user.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.MultiIdentifierLoadAccess;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pradip.entity.Foo;
import com.pradip.pojo.User;
import com.pradip.user.dao.UserDao;

@Service
public class UserDaoImpl implements UserDao {

	private static final Logger LOGGER = Logger.getLogger(UserDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	private static int count = 0;
	private int startIndex = 1;
	private int endIndex = 0;
	private int addCount = 6;

	public void printUser() {
		LOGGER.debug("printUser() is executed...");
	}

	@Override
	public void addDummyUsers() {

		Session session = this.sessionFactory.getCurrentSession();
		if (count == 0) {
			endIndex = addCount;
		} else {
			startIndex = count * addCount;
			endIndex = startIndex + addCount;
		}
		for (long i = startIndex; i < endIndex; i++) {
			Foo foo = new Foo("user" + i);
			foo.setDescription("password" + i);
			session.saveOrUpdate(foo);
		}
	}

	@Override
	public List<User> getUsers() {
		LOGGER.debug(" startIndex :: " + 1 + " :: endIndex :: " + endIndex);
		List<User> users = getAllDummyUsers();
		count++;
		return users;
	}

	@SuppressWarnings("unused")
	private List<User> getAllDummyUsersOld() {
		Session session = this.sessionFactory.getCurrentSession();
		List<User> users = new ArrayList<User>();
		for (long i = 1; i < endIndex; i++) {
			Foo foo = session.get(Foo.class, i);
			User user = new User();
			user.setUserName(foo.getName());
			user.setPassword(foo.getDescription());
			users.add(user);
		}
		return users;
	}
	
	private List<User> getAllDummyUsers() {
		Session session = this.sessionFactory.getCurrentSession();
		MultiIdentifierLoadAccess<Foo> multiLoadAccess = session.byMultipleIds(Foo.class);
		
		List<Foo> foos = null;
		List<User> users = null;
		
		List<Long> ids = new ArrayList<Long>();
		for (long i = 1; i < endIndex; i++) {
			ids.add(i);			
		}
		foos = multiLoadAccess.multiLoad(ids);
		if(null != foos) {
			users = new ArrayList<User>();
			for (Iterator<Foo> iterator = foos.iterator(); iterator.hasNext();) {
				Foo foo = (Foo) iterator.next();
				User user = new User();
				user.setUserName(foo.getName());
				user.setPassword(foo.getDescription());
				users.add(user);
			}
		}
		return users;
	}

}