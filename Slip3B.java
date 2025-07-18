//Slip3:B) Define abstract class Shape with abstract methods area() and 
//volume().Derive abstract class Shape into two classes 
//Cone and Cylinder. Write a java program to calculate area and volume of Cone and Cylinder.(Use Super Keyword).

import java.util.*;

abstract class Shape
{
	float a,r,h,v;
	final float PI=3.14f;
	Scanner src=new Scanner(System.in);
	abstract void area();
	abstract void volume();

}
class Cone extends Shape
{
		float a,r,h,v;
		void accept()
	{
		System.out.println("Enter radius and height of cone");
		r=src.nextFloat();
		h=r=src.nextFloat();
	}
		public void area()
	{
		a=super.PI*r*(r+(float)Math.sqrt(h*h+r*r));
		System.out.print("Area of Cone:"+a);
	}
		public void volume()
	{
		v=super.PI*r*r*(h/3);
		System.out.print("Volume of Cone:"+v);
	}
}
class Cylinder extends Shape
{
		float a,r,h,v;
		void accept()
	{
		System.out.println("Enter radius and height of Cylinder");
		r=src.nextFloat();
		h=src.nextFloat();
	}
		public void area()
	{
		a=(2*super.PI*r*h)+(2*super.PI*r*r);
		System.out.println("Area of Cylinder:"+a);
	}
		public void volume()
	{
		v=super.PI*r*r*h;
		System.out.print("Volume of Cylinder:"+v);
	}
	
}	

class Slip3B 
{
	public static void main(String args[])
{
	Shape s;
	Cylinder c1=new Cylinder();
	s=c1;
	

	c1.area();
	c1.volume();
	
	
}
}

