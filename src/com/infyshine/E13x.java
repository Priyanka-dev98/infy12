package com.infyshine;

public class E13x {

	public static void main(String[] args) {
		System.out.println("in main method start");
		m1();
		System.out.println("in main method end");
	}
	static void m1() {
		try {
			System.out.println("in m1 method start");
			System.out.println(10/0);
			System.out.println("in m1 method end");
		}
		catch(ArithmeticException ae) {
			System.out.println("in m1 method catch");
		}
	}

}
