package com.infyshine;

public class Shape {
	int length = 20;
	int breadth = 30;
	int height = 40;
	float Area;
	 public float square() {
		 Area = length*length*breadth*breadth;
		 System.out.println("Area of square is" + Area);
		 return Area;
	}
	 public float rect() {
		Area = 2*length*breadth;	
		System.out.println("Area of rect  is" + Area );
		return Area;
	}
	void display() {
		if(length == breadth)
		{
			System.out.println("square");
		}
		else
		{
			System.out.println("not a square");
		}
	}

	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.square();
		s1.rect();
		s1.display();
	}

}
