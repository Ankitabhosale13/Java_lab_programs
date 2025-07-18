//Slip18 :(A)-Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method Overloading).

import java.util.*;
class slip18A
{
		void Area(int r)
	{
		System.out.println("Area of Circle :"+(3.14*r*r));
	}
		float Area(int b,float h)
	{
		return b*h/2;
	}
		double Area(int l, int rb)
	{
		return l*rb;
	}
		public static void main(String args[])
	{
		int r,b,l,rb;
		float h;

		Scanner sr=new Scanner(System.in);

		System.out.print("Enter radius:");
		r=sr.nextInt();
		
		System.out.print("Enter base:");
		b=sr.nextInt();

		System.out.print("Enter height:");
		h=sr.nextFloat();

		System.out.print("Enter length:");
		l=sr.nextInt();
	
		System.out.print("Enter breadth");
		rb=sr.nextInt();
	
		slip18A  s1=new slip18A();
		
		s1.Area(r);
		
		System.out.println("Area of Triangle is:" +s1.Area(b,h));
		
		System.out.println("Area of Reactangle is:" +s1.Area(l,rb));
	}

}
