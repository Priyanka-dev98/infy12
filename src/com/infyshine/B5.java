package com.infyshine;

public class B5 extends Inherit2{
	static int a = 50;
	int x = 60;
	static void m1() {
		System.out.println("B class m1");
	}
void m2() {
	System.out.println("B class m2");
}
	public static void main(String[] args) {
		System.out.println("a: "+a);
		m1();
		B5 b = new B5();
		System.out.println("x: "+b.x);
		b.m2();
		b.m3();

	}

}
