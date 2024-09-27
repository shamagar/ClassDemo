//Demonstrate how to create class and object of the class

package com.LunchClassDemo;

//Create class of a Rectangle
class Rectangle
{
	//Properties of the Rectanle class
	public double length;
	public double wide;
	
	
	//Function of the class
	//Calculting area of a Rectangle
	public double area()
	{
		return length*wide;
	}
	
	//Calculting Perimeter of a Rectangle
	public double Perimeter()
	{
		return 2*(length+wide);
	}
	
	//Ckecking for a  square
	public boolean isSquare()
	{
		if(length == wide)
			return true;
		else
			return false;
	}
}


public class LunchClassDemo1 
{

	public static void main(String[] args) 
	{
		Rectangle re = new Rectangle();
		
		re.length=5.6;
		re.wide = 3.2;
		
		System.out.println("Area of a rectangle is "+re.area());
		System.out.println("Perimeter of a rectangle is "+re.Perimeter());
		System.out.println("Is it a Square: "+re.isSquare());

	}

}
