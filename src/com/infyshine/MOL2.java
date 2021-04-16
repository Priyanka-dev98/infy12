package com.infyshine;

public class MOL2 {
	public static void main(String[] bdsvf) {
		Calleelimp cl = new Calleelimp();
		 Object ob1 = new Object();
		 Object ob2 = "Priyanka";
		 Object ob3 = new Integer(7279);
		 
		 cl.foo(ob1);
		 cl.foo(ob2);
		 cl.foo(ob3);
		 
		 System.out.println();
		 cl.foo("PK");
		 cl.foo(7279);
		 
		 System.out.println();
		 cl.foo((String)ob2);
		 cl.foo((String)ob3);
		 
		 System.out.println();
		 cl.foo((String)ob1);
		 cl.foo((Integer)ob2);
		 cl.foo((String)ob3);
		 cl.foo((Integer)ob2);
		

	}

}
