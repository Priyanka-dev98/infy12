package com.infyshine;

public class SuperClass {
	SuperClass()
	{
		this(10);
		System.out.println("superclass no-arg");
	}
   SuperClass(int a)
   {
	   this("abc");
	   System.out.println("superclass int-arg");
   }
   SuperClass(String s)
   {
	   System.out.println("superclass String-arg");
   }
}
