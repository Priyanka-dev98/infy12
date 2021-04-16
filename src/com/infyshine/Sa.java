package com.infyshine;

public class Sa extends Ex {
           void m1() {
        		System.out.println("Sample m1");
           }
           void m2() {
        	   super.m2();
       		System.out.println("Sample m2");
          }
           
	public static void main(String[] args) {
	     Sa s = new Sa();
	     s.m1();
	     s.m2();
	     s.m3();
	}

}
