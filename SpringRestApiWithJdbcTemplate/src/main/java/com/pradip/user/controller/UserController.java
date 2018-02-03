package com.pradip.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pradip.pojo.User;
import com.pradip.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		HttpHeaders headers = new HttpHeaders();
		if (user == null) {
			return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
		}
		this.userService.createUser(user);

		headers.add("User Created  - ", String.valueOf(user.getFirstName()));
		return new ResponseEntity<User>(user, headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<User>> users() {
		HttpHeaders headers = new HttpHeaders();
		List<User> users = this.userService.findAllUsers();
		if (users == null) {
			return new ResponseEntity<List<User>>(HttpStatus.NOT_FOUND);
		}
		headers.add("Number Of Records Found", String.valueOf(users.size()));
		return new ResponseEntity<List<User>>(users, headers, HttpStatus.OK);
	}

}