package com.infyshine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

public class Divisio {
	public static void div() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a;
			while(true) {
				try {
					System.out.println("\nenter first number: ");
					a = Integer.parseInt(br.readLine());
					break;
				}
				catch(NumberFormatException nfe) {
					System.out.println("enter only integer");
				}
			}
			while(true) {
				try {
					System.out.println("\nentersecond number: ");
					int b = Integer.parseInt(br.readLine());
					try {
						int c = a/b;
						System.out.println("Result: "+c);
						break;
					}
					catch(ArithmeticException ae) {
						System.out.println("Do not pass ZERO");
					}
			}
				catch(NumberFormatException nfe) {
					System.out.println("enter only integer");
				}
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

}
