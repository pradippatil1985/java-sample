package com.invesco.first;

import java.util.ArrayList;
import java.util.List;

public class Addresses {
	private List<Address> address;

	public List<Address> getAddress() {
		if (null == this.address) {
			this.address = new ArrayList<Address>();
		}
		return this.address;
	}

	@Override
	public String toString() {
		return "[ address = " + address + "]";
	}
}
