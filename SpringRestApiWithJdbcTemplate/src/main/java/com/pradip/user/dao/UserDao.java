package com.pradip.user.dao;

import java.util.List;

import com.pradip.pojo.User;

public interface UserDao {

	public int createUser(User user);

	public List<User> findAllUsers();

}