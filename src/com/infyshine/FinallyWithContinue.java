package com.infyshine;

public class FinallyWithContinue {

	public static void main(String[] args) {
	    for(int i = 1 ; i<=10 ; i++) {
	    	System.out.println("\nin loop: "+i);
	    	try {
	    		System.out.println("in try");
	    	    if(i == 5) {
	    	    	continue;
	    	      }
	            }
	    	finally {
	    		System.out.println("in finally");
	    	}
           System.out.println("after try/finally");
	}
	    System.out.println("\nafter loop");
	}
	
}
