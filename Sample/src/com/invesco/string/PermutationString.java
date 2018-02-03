package com.invesco.string;

import java.util.HashSet;
import java.util.Set;

public class PermutationString {
	public static void main(String[] args) {
		String alpha = "ABC";
		char[] seq = alpha.toCharArray();

		int length = 3;
		StringBuilder builder = new StringBuilder("   ");

		int[] pos = new int[length];
		int total = (int) Math.pow(alpha.length(), length);
		System.out.println(total);
		Set<String> perm = new HashSet<String>();
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
			perm.add(builder.toString());
		}
		System.out.println(perm);
	}

}
