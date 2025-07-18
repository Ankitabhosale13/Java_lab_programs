//Slip19 : (A) - Write a java program to display fibonacci series using recursion
class slip19A
{
	static int a=0,b=1,c;
	void printF(int i)
	{
		if(i>=1)
             	    {
		c=a+b;
		System.out.println("Value of c is"+c);
		a=b;
		b=c;
		printF(i-1);
	}
	}
		public static void main(String args[])
	{
		slip19A slip=new slip19A();
		System.out.print(a+""+b);
		slip.printF(10);
	}
}