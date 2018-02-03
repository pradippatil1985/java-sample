package com.invesco.first;
//public class User implements Comparable<User> {
public class User {
	private String firstName;
	private String lastName;
	private Addresses addresses;
	public User() {
		super();
	}
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public User(String firstName, String lastName, Addresses addresses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addresses = addresses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Addresses getAddresses() {
		return addresses;
	}
	public void setAddresses(Addresses addresses) {
		this.addresses = addresses;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

	// @Override
	// public int compareTo(User user) {
	// int firstNameComp = this.firstName.compareTo(user.getFirstName());
	// return ((firstNameComp == 0) ? this.lastName.compareTo(user.getLastName()) :
	// firstNameComp);
	// // return this.firstName.compareTo(user.firstName);
	// }
	@Override
	public String toString() {
		return "[ firstName = " + firstName + ", lastName = " + lastName + ", addresses = " + addresses + "]";
	}
}