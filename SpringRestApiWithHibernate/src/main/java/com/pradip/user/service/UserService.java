package com.pradip.user.service;

import java.util.List;

import com.pradip.pojo.User;

public interface UserService {

	public int createUser(User user);

	public List<User> findAllUsers();

	public void addAllDummyUsersData();

}