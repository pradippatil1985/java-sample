package com.pradip.user.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pradip.pojo.User;
import com.pradip.user.service.UserBo;

public class UserSpringAction {

	@Autowired
	private UserBo userBo;
	
	private List<User> users;
	
	public UserBo getUserBo() {
		return userBo;
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String execute() throws Exception {
//		this.userBo.printUser();
		this.userBo.addDummyUsers();
		this.users = this.userBo.getUsers();
		return "success";
	}
}