//Slip22 : (A)- Write a java program to display factorial using recursion.

class slip22A
{
		static int fact=1;
		void calFact(int no)
	{
		if(no>=1)
	{
		fact=fact*no;
		calFact(no-1);
	}
	}

		public static void main(String args[])
	{
		int no=5;
		slip22A slip= new slip22A();
		slip.calFact(no);
		System.out.print("Factorial number is : " +no+"is"+fact);
	
	}
}
