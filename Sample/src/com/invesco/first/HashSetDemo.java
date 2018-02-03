package com.invesco.first;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSetDemo hashSetDemo = new HashSetDemo();
		hashSetDemo.test();
	}

	public void test() {
		Set<User> users = new HashSet<User>();
		for (int i = 0; i < 6; i++) {
			String firstName = "Pradip" + i % 4;
			String lastName = "Patil";
			// Addresses addresses = null;
			Addresses addresses = populateAddresses();
			User user = new User(firstName, lastName, addresses);
			System.out.println("Duplicate :: " + users.contains(user));
			users.add(user);
		}
		// users = new TreeSet<User>(users);
		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
		User user = new User();
		user.setFirstName("Pradip" + 1);
		user.setLastName("Patil");
		System.out.println("Does set contains user? " + users.contains(user));
	}

	public Addresses populateAddresses() {
		List<Address> addressSet = new ArrayList<Address>();
		for (int j = 0; j < 2; j++) {
			int min = 77000;
			int max = 77999;
			Random random = new Random();
			int randomNumber = random.nextInt(max + 1 - min) + min;
			String city = "Houston" + j;
			String zipCode = "" + randomNumber;
			String state = "Texas";
			String country = "USA";
			Address address = new Address(city, zipCode, state, country);
			addressSet.add(address);
		}
		Addresses addresses = new Addresses();
		addresses.getAddress().addAll(addressSet);
		return addresses;
	}
}