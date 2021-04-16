package com.infyshine;

public class E15x {

	public static void main(String[] args) {
		System.out.println("in main method start");
        try {
        	m1();
        }
        catch(ArithmeticException ae) {
        	System.out.println("in main catch");
        }
        System.out.println("in main method end");
	}
	static void m1() {
		System.out.println("in m1 method start");
		System.out.println(10/0);
		System.out.println("in m1 method end");
	}

}
 