package com.infyshine;

public class Return {

	public static void main(String[] args) {

		    	try {
		    		System.out.println("in try");
		    	    return;
		            }
		    	finally {
		    		System.out.println("in finally");
		    	}
	           System.out.println("after try/finally");
		}
		
	}


	


