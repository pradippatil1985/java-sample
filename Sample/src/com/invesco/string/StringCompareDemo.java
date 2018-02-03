package com.invesco.string;

public class StringCompareDemo {

	public static void main(String[] args) {
		String a = "A";
		System.out.println(" 1 ==> " + (a == "A"));
		System.out.println(" 2 ==> " + a.equals("A"));
		
		String b = "A";
		System.out.println(" 3 ==> " + (a == b));
		System.out.println(" 4 ==> " + a.equals(b));
		
		String c = new String("A");
		c = c.intern();
		System.out.println(" 5 ==> " + (c == a));
		System.out.println(" 6 ==> " + c.equals(a));
		
		
		String d = a;
		System.out.println(" 7 ==> " + (d == a));
		System.out.println(" 8 ==> " + d.equals(a));
		
		String s1 = "0-42L";
		String s2 = "0-43-";
		
		System.out.println( "s1 :: "+ s1.hashCode() + " :: s2 :: "+s2.hashCode());
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() == s2.hashCode());
		
		

	}

}
