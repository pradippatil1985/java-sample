package com.test;

import java.util.Arrays;

public class MyHashMapByArray {

	private Container c;

	int initSize = 2;
	private Container[] recordArray;

	public MyHashMapByArray() {
		recordArray = new Container[initSize];
	}

	public void removeElement(Container[] arr, int removedIdx) {
		System.arraycopy(arr, removedIdx + 1, arr, removedIdx, arr.length - 1 - removedIdx);
	}

//	public static Container[] removeElement(Container[] input, Container deleteObject) {
//		List<Object> result = new LinkedList<Object>();
//		for (Container item : input)
//			if (!deleteObject.equals(item))
//				result.add(item);
//		return (Container[]) result.toArray(input);
//	}

	public void put(Object k, Object v) {
		this.c = new Container(k, v);
		// check for the same key before adding
		for (int i = 0; i < this.recordArray.length; i++) {
			Container c1 = this.recordArray[i];
			if (null != c1 && k.equals(c1.key)) {
				// remove the existing object
//				removeElement(this.recordArray, c1);
				removeElement(this.recordArray, i);
				break;
			}
		}
		boolean isArrayFull = false;
		for (int i = 0; i < this.recordArray.length; i++) {
			Container c1 = this.recordArray[i];
			if (null == c1) {
				this.recordArray[i] = this.c;
				isArrayFull = true;
				break;
			}
		}

		if (false == isArrayFull) {
			this.recordArray = Arrays.copyOf(this.recordArray, this.recordArray.length + initSize);
			put(k, v);
		}
	}

	public Object get(Object k) {
		for (int i = 0; i < this.recordArray.length; i++) {
			Container con = this.recordArray[i];
			if (null != con && con.key.toString() == k.toString()) {
				return con.value;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		MyHashMapByArray hm = new MyHashMapByArray();
		hm.put("2", "2");
		hm.put("3", "3");
		hm.put("1", "1");
		System.out.println("Value for key 3 :: " + hm.get("3"));
		hm.put("3", "4");
		System.out.println(" ======================= ");
		System.out.println("Value for key 1 :: " + hm.get("1"));
		System.out.println("Value for key 2 :: " + hm.get("2"));
		System.out.println("Value for key 3 :: " + hm.get("3"));
		System.out.println("Value for key 8 :: " + hm.get("8"));

		System.out.println(" ======================= ");
		for (int i = 0; i < hm.recordArray.length; i++) {
			System.out.println(i + "  " + hm.recordArray[i]);
		}
	}
	
	class Container {
		Object key;
		Object value;

		Container(Object k, Object v) {
			this.key = k;
			this.value = v;
		}

		@Override
		public int hashCode() {
			int hash = (int) key.hashCode();
			System.out.println("hashCode for key: " + key + " = " + hash);
			return hash;
		}

		@Override
		public boolean equals(Object obj) {
			return key.equals(((Key) obj).key);
		}

		@Override
		public String toString() {
			return "Value for key " + this.key + " :: " + this.value;
		}
	}

}


