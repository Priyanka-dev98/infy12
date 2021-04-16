package com.infyshine;

public class exar {

	public static void main(String[] args) {
	    try {
	    	System.out.println("in try");
	    	System.out.println("10/0");
	    }
        catch(NullPointerException npe){
        	System.out.println("in catch"); 	
        }
	    finally {
	    	System.out.println("in finally");
	    }
	    System.out.println("after try/catch/finally");
	}

}
