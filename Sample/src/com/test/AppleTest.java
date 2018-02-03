package com.test;

public class AppleTest {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			create(i);
		}
	}

	private static void create(int index) {
		int startIndex = 0;
		int endIndex = 0;
		int addCount = 5;
		if (index == 0) {
			endIndex = addCount;
		} else {
			startIndex = index * addCount;
			endIndex = startIndex + addCount;
		}
		System.out.println(" startIndex :: " + startIndex + " :: endIndex :: " + endIndex);
	}

}

class Foo {

	private long id;

	private String name;

	private String description;

	Foo() {
		// for hibernate.
	}

	public Foo(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
