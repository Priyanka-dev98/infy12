package com.infyshine;

public class Division {

	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
		}
		catch(ArrayIndexOutOfBoundsException aiob){
			System.out.println("Please pass atleast two integer values");
		}
        catch(NumberFormatException nfe) {
        	System.out.println("please pass only integer values");
        }
		catch(ArithmeticException ae) {
			System.out.println("Please DONOT pass second value as ZERO");
		}
	}

}
