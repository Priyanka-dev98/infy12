package com.infyshine;

public class SubClass extends SuperClass{
	SubClass()
	{
		this(10);
		System.out.println("subclass no-arg");
	}
    SubClass(int a)
    {
    	this("abc");
    	System.out.println("subclass int-arg");
    }
    SubClass(String str)
    {
    	System.out.println("subclass string-arg");
    }
}
