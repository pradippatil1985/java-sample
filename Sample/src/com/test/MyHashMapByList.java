package com.test;

import java.util.ArrayList;
import java.util.List;

public class MyHashMapByList {

	private Container c;

	private List<Container> recordList;
	
	public MyHashMapByList() {
		this.recordList = new ArrayList<Container>();
	}

	public void put(Object k, Object v) {
		this.c = new Container(k, v);
		// check for the same key before adding
		for (int i = 0; i < recordList.size(); i++) {
			Container c1 = recordList.get(i);
			if (c1.key.equals(k)) {
				// remove the existing object
				recordList.remove(i);
				break;
			}
		}
		recordList.add(c);
	}

	public Object get(Object k) {
		for (int i = 0; i < this.recordList.size(); i++) {
			Container con = this.recordList.get(i);
			// System.out.println("k.toString():"+k.toString()+"con.key.toString()"+con.key.toString());
			if (k.toString() == con.key.toString()) {
				return con.value;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		MyHashMapByList hm = new MyHashMapByList();
		hm.put("2", "2");		
		hm.put("3", "3");
		hm.put("1", "1");
		System.out.println("Value for key 3 :: "+hm.get("3"));
		hm.put("3", "4");
		System.out.println(" ======================= ");
		System.out.println("Value for key 1 :: "+hm.get("1"));
		System.out.println("Value for key 2 :: " + hm.get("2"));
		System.out.println("Value for key 3 :: "+hm.get("3"));
		System.out.println("Value for key 8 :: "+hm.get("8"));
	}
	
	class Container {
		Object key;
		Object value;
		Container(Object k, Object v) {
			this.key = k;
			this.value = v;
		}
	}

}


