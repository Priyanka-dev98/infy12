package com.infyshine;


public class Test {
	       static void m3(Object obj) {
	    	   if(obj instanceof Example)
	    	   {
	    		   Example e = (Example)obj;
	    		   e.m1();
	    	   }
	    	   else if(obj instanceof Sample1)
	    	   {
	    		   Sample1 s = (Sample1)obj;
	    		   s.m1();
	    		   s.m2();
	    	   }
	       }
	       


	public static void main(String[] args) {
		Test.m3(new Example());
		Test.m3(new Sample1());
		Test.m3(new Object());
	

	}

}
