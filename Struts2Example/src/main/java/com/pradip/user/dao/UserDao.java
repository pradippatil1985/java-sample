package com.pradip.user.dao;

import java.util.List;

import com.pradip.pojo.User;

public interface UserDao {

	public void printUser();
	
	public void addDummyUsers();

	public List<User> getUsers();

}