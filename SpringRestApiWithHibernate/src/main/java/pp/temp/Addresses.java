package pp.temp;

import java.util.ArrayList;
import java.util.List;

public class Addresses {
	private List<Address> address;
	public List<Address> getAddress() {
		if (null == address) {
			address = new ArrayList<Address>();
		}
		return address;
	}
	@Override
	public String toString() {
		return "[ address = " + address + "]";
	}
}
