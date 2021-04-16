package com.infyshine;

public class Calleelimp {
	public void foo(Object O) {
		System.out.println("Object parameter");
	}
    public void foo(String S) {
    	System.out.println("String parameter");
    }
    public void foo(Integer I) {
    	System.out.println("Integer parameter");
    }
}
