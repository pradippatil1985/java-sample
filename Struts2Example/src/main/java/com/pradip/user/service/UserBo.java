package com.pradip.user.service;

import java.util.List;

import com.pradip.pojo.User;

public interface UserBo {

	public void printUser();

	public void addDummyUsers();
	public List<User> getUsers();

}