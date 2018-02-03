package com.test;

public class PermutationBest {
	public static void main(String[] args) {
		String str = "12345678";
		int length = 5;
		PermutationBest permutation = new PermutationBest();
		permutation.permute(str, length);

	}

	private void permute(String str, int length) {
		int total = (int) Math.pow(str.length(), length);
		System.out.println(total);
	}

}
