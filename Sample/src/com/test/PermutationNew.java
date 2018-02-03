package com.test;

public class PermutationNew {
	public static void main(String[] args) {
		String alpha = "12345678";
		char[] seq = alpha.toCharArray();

		int length = 5;
		StringBuilder builder = new StringBuilder("     ");

		int[] pos = new int[length];
		int total = (int) Math.pow(alpha.length(), length);

		for (int i = 0; i < total; i++) {
			for (int x = 0; x < length; x++) {
				if (pos[x] == seq.length) {
					pos[x] = 0;
					if (x + 1 < length) {
						pos[x + 1]++;
					}
				}
				builder.setCharAt(x, seq[pos[x]]);
			}
			pos[0]++;

			System.out.println(builder.toString());
		}
		System.out.println(total);
		int power = 2;
		int length1 = 4;
		int combi = 1;
		for (int i = 0; i < power; i++) {
			combi = combi * length1;
		}
		System.out.println(combi);

	}

}
