package com.infyshine;

public class E3x {

	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("in try");
			return 10;
		}
		finally {
			System.out.println("in finally");
		}
		System.out.println("after try/finally");
		return 20;
	}

}
