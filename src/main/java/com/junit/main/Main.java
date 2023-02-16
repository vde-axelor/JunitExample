package com.junit.main;

public class Main {

	public int calsi(int p, int r, int n) {
		int si = (p * r * n) / 100;
		System.out.println("This is Simple interest : " + si);
		return si;
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.calsi(5000, 12, 3);
	}

}
