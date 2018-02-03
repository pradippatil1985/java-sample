package com.pradip.user.service.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.pradip.pojo.User;
import com.pradip.user.dao.UserDao;
import com.pradip.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public int createUser(User user) {
		// if(null == user.getAddresses()) {
		// user.setAddresses(populateAddresses());
		// }
		return this.userDao.createUser(user);
	}

	@Override
	@Transactional()
	public List<User> findAllUsers() {
		return this.userDao.findAllUsers();
	}

	@Override
	public void addAllDummyUsersData() {
		Set<User> users = new HashSet<User>();
		for (int i = 0; i < 6; i++) {
			String firstName = "Pradip" + i % 4;
			String lastName = "Patil";
			// Addresses addresses = populateAddresses();
			// User user = new User(firstName, lastName, addresses);
			User user = new User(firstName, lastName);
			System.out.println("Duplicate :: " + users.contains(user));
			users.add(user);
		}

		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
		User userTemp = new User();
		userTemp.setFirstName("Pradip" + 1);
		userTemp.setLastName("Patil");

		System.out.println("Does set contains user? " + users.contains(userTemp));

	}

	// @SuppressWarnings("unused")
	// private Addresses populateAddresses() {
	// List<Address> addressSet = new ArrayList<Address>();
	// for (int i = 0; i < 2; i++) {
	// int min = 77000;
	// int max = 77999;
	// Random random = new Random();
	// int randomNumber = random.nextInt(max + 1 - min) + min;
	// String city = "Houston" + i;
	// String zipCode = "" + randomNumber;
	// String state = "Texas";
	// String country = "USA";
	// Address address = new Address(city, zipCode, state, country);
	// addressSet.add(address);
	// }
	// Addresses addresses = new Addresses();
	// addresses.getAddress().addAll(addressSet);
	// return addresses;
	// }

}