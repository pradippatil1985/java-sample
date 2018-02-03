package com.pradip.pojo;

public class Address {
	private String city;
	private String zipCode;
	private String state;
	private String country;
	public Address() {
		super();
	}
	public Address(String city, String zipCode, String state, String country) {
		super();
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "[ city = " + city + ", zipCode = " + zipCode + ", state = " + state + ", country = " + country + "]";
	}
}