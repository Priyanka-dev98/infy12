package com.infyshine;

abstract class Example3 {
	abstract void m1(); 
	static int a = 10;
	int x = 20;
	
	static {
		System.out.println("Example SB");
	}
	{
		System.out.println("Example NSB");
	}
	Example3()
	{
		System.out.println("Example constructor");
	}
	static void m2()
	{
		System.out.println("Example SM");
	}
	void m3()
	{
		System.out.println("Example NSM");
	}
	public static void main(String [] args)
	{
		System.out.println("Example main");
		System.out.println("a: "+a);
		m2();
		
		Example e = new Example();
		e.m3();
	}
}