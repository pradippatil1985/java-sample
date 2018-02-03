package com.invesco.string;

public class StringTest {

	public static void main(String[] args) {
		StringTest stringTest = new StringTest();
		System.out.println("isPalindrome :: " + stringTest.isPalindrome("a"));
		System.out.println("isPalindrome :: " + stringTest.isPalindromeString("a"));
	}

	private boolean isPalindrome(String str) {
		if (str == null)
			return false;
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		return strBuilder.toString().equals(str);
//		return StringUtils.reverse(str).equals(str);
	}
	
	private boolean isPalindromeString(String str) {
		if (str == null)
			return false;
		int length = str.length();
		System.out.println(length / 2);
		for (int i = 0; i < length / 2; i++) {
			if (str.charAt(i) != str.charAt(length - i - 1))
				return false;
		}
		return true;
	}

}
