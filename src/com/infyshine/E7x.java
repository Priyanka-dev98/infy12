package com.infyshine;

public class E7x {

	public static void main(String[] args) {
		System.out.println(m1());
		
			
		}
	    static void m1() {
	    	try {
	    		System.out.println("in try");
	    		return 10;
	    	}
	    	catch(ArithmeticException e) {
	    		System.out.println("in catch");
	    		
	    	}
	    	finally {
				System.out.println("in finally");
				if(true) {
					return 30;
				}
				System.out.println("after try/catch/finally");
			}
	}
	


	}


