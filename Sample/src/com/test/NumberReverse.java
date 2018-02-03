package com.test;

public class NumberReverse {

	public int reverseNumber(int number) {

		int reverse = 0;
		while (number != 0) {
			reverse = (reverse * 10) + (number % 10);
			number = number / 10;
		}
		return reverse;
	}
	
	public int reverseMethod(int number) {
		int reverse = number;
		String rn = "";
		if (number < 10) {
			System.out.println(number);
			return number;
		} else {
			rn += number % 10;
			reverseMethod(number / 10);
		}
		reverse = new Integer(rn);
		return reverse;
	}

	public static void main(String a[]) {
		NumberReverse nr = new NumberReverse();
		System.out.println("reverseNumber Result: " + nr.reverseNumber(150));
		System.out.println("reverseMethod Result: " + nr.reverseNumber(150));
	}

}
