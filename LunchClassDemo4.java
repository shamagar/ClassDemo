//Demonstrated constructors
package com.LunchClassDemo;

class Rectangle1
{
	private double length;
	private double breadth ;
	
	//Non Parameterized constructor
	public Rectangle1()
	{
		length = 1;
		breadth  = 1;
	}
	//Parameterized constructor
	public Rectangle1(double l, double b)
	{
		//length = l;
		//breadth  = b;
		
		setLength(l);
		setBreadth(b);
	}
	
	//Parameterized constructor
	public Rectangle1(double s)
	{
		length = breadth = s;
	}
	
	//Getter and setter methods to read and write the data 
	public double getLength()
	{
		return length;
	}
	
	public double getBreadth()
	{
		return breadth;
	}
	
	public void setLength(double l)
	{
		if(l >= 0)
			length = l;
		else
			length = 0;
	}
	
	public void setBreadth(double b)
	{
		if(b >= 0)
			breadth = b;
		else
			breadth = 0;
	}
	
	//Methods 
	public double Area()
	{
		return length * breadth;
	}
	
	public double Perimater()
	{
		return 2*(length + breadth);
	}
	
	public boolean isSquare()
	{
		if(length == breadth)
			return true;
		else
			return false;
	}
	
	
}
public class LunchClassDemo4 
{

	public static void main(String[] args) 
	{
		Rectangle1 r = new Rectangle1(-10,5);
		System.out.println("Area is "+r.Area());
		System.out.println("Perimeter is "+r.Perimater());

	}

}
