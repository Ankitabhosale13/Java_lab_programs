//slip8 A)-

import java.util.*;

interface Shape
{
	void area();
}

class Circle implements Shape
{
	final float PI=3.14f;
	float area_of_circle,r;
	Scanner src=new Scanner(System.in);

	void accept()
	{
		System.out.println("Enter radius of circle");
		r=src.nextFloat();
	}
	public void area()
	{
		area_of_circle=PI*r*r;
	}
	public void show()
	{
		System.out.println("Area of Circle:"+area_of_circle);
	}
}
class Sphere implements Shape
{
	final float PI=3.14f;
	float area_of_sphere,r;
	Scanner src=new Scanner(System.in);
	
	void accept()
	{
		System.out.println("Enter radius of sphere");
		r=src.nextFloat();
	}
	public void area()
	{
	area_of_sphere=4*PI*r*r;
	}
	
	public void show()
	{
	System.out.println("Area of Sphere is :"+area_of_sphere);
	}
}

class Test
{
	public static void main(String args[])
{
	Circle c1=new Circle();
	Sphere s1=new Sphere();
	
	c1.accept();
	s1.accept();
	c1.area();
	s1.area();
	c1.show();
	s1.show();
}
}	