package com.infyshine;

public class E10x {

	public static void main(String[] args) {
		m1();
	}
    static void m1() {
    	try {
    		System.out.println("in outer try");
    		try {
    			System.out.println("in inner try");
    			System.out.println(10/0);
    		}
    		catch(NullPointerException e) {
    			System.out.println("in inner catch");
    		}
    		finally {
    			System.out.println("in inner finally");
    		}
    		System.out.println("after inner try/catch/finally");
    	}
    	catch(NullPointerException e) {
    		System.out.println("in outer catch");
    	}
    	finally {
    		System.out.println("in outer finally");
    	}
    	System.out.println("after outer try/catch/finally");
    }
}
