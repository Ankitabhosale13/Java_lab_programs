//slip 4- 1. Write a java program to display alternate character from a given string.

import java.util.*;
public class string
{
	public static void main(String args[])
{
	String s;
	Scanner r = new Scanner(System.in);
	System.out.println("Enter a string:");
	s=r.next();
	for(int i=0;i<s.length();i+=2)
{
	System.out.print(s.charAt(i));
}
	System.out.println(" ");
}
}
	