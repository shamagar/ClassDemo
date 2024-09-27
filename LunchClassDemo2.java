//Demonstrating to create the class of cylinder and its object

package com.LunchClassDemo;

class Cylinder
{
	//Properties of a cylinder 
	private int radius;
	private int height;
	
	//Non parameterize Constructor
	public Cylinder()
	{
		radius = height = 0;
	}
	
	public Cylinder(int r)
	{
		radius = r;
		height = 1;
	}
	//parameterize Constructor
	public Cylinder(int r, int h)
	{
		//radius = r;
		//height = h;
		setRadius(r);
		setHeight(h);
	}

	//Geter and setter methods for private properties
	public int getRadius()
	{
		return radius;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setRadius(int r) 
	{
		if(r >= 0)
			radius = r;
		else
			radius = 0;
	}

	public void setHeight(int h) 
	{
		if(h >= 0)
			height = h;
		else
			height = 0;	
	}
	
	//Methods or Functions
	public double lidArea()
    {
        return Math.PI*radius*radius;
    }
	
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    
    public double drumArea()
    {
        return 2*lidArea()+perimeter()*height;
    }
    
    public double volume()
    {
        return lidArea()*height;
    }

	public void setDimensions(int r, int h) 
	{
		radius = r;
		height = h;
		
	}
	
}

public class LunchClassDemo2 
{

	public static void main(String[] args) 
	{
		//Creating object of a cylinder
		Cylinder c = new Cylinder(14,7);
		
		/*
		c.setRadius(7);
		c.setHeight(14);
		c.setDimensions(7, 14);
        */
		
        System.out.println("LidArea of a Cylinder with given values is "+c.lidArea());
        System.out.println("Circumference of a Cylinder with given values is "+c.perimeter());
        System.out.println("TotalSurfaceArea of a Cylinder with given values is "+c.drumArea());
        System.out.println("Volume of a Cylinder with given values is "+c.volume());
        System.out.println("Given Height vlaue: "+c.getHeight());
        System.out.println("Given Radius value: "+c.getRadius());

	}

}
