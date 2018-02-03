package com.pradip.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pradip.pojo.User;
import com.pradip.user.dao.UserDao;
import com.pradip.user.service.UserBo;

@Service
public class UserBoImpl implements UserBo {

	@Autowired
	private UserDao userDao;

	public void printUser() {
		this.userDao.printUser();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addDummyUsers() {
		this.userDao.addDummyUsers();
	}

	@Override
	@Transactional()
	public List<User> getUsers() {
		return this.userDao.getUsers();
	}

}