package com.infyshine;

public class Example2 {
int x = m1();
{
	System.out.println("NSB");
}
int m1(){
System.out.println("m1 : x");
return 10;
}
Example2() {
	this(10);
	x = 50;
	System.out.println("No-arg constructor");
	
}
Example2(int a) {
	this("abc");
	x = 60;
	System.out.println("int-arg constructor");
}
Example2(String str) {
	x = 70;
	System.out.println("String-arg constructor");
}



	public static void main(String[] args) {
		Example2 e1 = new Example2();
		System.out.println("e1.x: " +e1.x);
		
		Example2 e2 = new Example2(10);
		System.out.println("e2.x: " +e2.x);
		
		Example2 e3 = new Example2("abc");
		System.out.println("e3.x: " +e3.x);
	}

}
