package com.junit.parameterized;

public class Fibonacci {
	public static int compute(int n) {
		int result = 0;

		if (n <= 1) {
			result = n;
		} else {
			result = compute(n - 1) + compute(n - 2);
		}
		return result;
	}

	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println("Fibonacci is  : " + f.compute(10));
	}

}
