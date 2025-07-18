//slip 6- 1.

import java.util.*;
class ZeroException extends Exception
{
	ZeroException()
{
	super("Number is 0");
}
}
class addfirstlastdigit
{
	static int n;
	public static void main(String args[])
{
	int i, rem,sum=0;
	try
{
	Scanner r = new Scanner(System.in);	
	n = r.nextInt();
	if(n==0)
{
	throw new ZeroException();
}
	else
{
	rem=n%10;
	sum=sum+rem;
	if(n>9)
{
	while(n>0)
{
	rem=n%10;
	n = n/10;
}
	sum=sum+rem;
}
	System.out.println("Sum is :" +sum);
}
}
	catch(ZeroException e)
{
	System.out.println(e);
}
}
}

	

	