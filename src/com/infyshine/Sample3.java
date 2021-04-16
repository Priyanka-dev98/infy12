package com.infyshine;

public class Sample3 extends Example3 {
	void m1() {
		System.out.println("B m1");
	}
	void m2() {
		System.out.println("B m2");
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.m1();
		s.m2();
		s.m3();

	}

}
