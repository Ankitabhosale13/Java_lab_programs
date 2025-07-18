//slip 4- 1. Write a java program to display alternate character from a given string.

import java.util.Scanner;
class alternate_string
{
public static void main(String args[])
{
Scanner r = new Scanner(System.in);
System.out.println("Enter a string:");
String str = r.nextLine();
try
{
for(int i=0; i<=str.length(); i=i+2)
{
System.out.print(str.charAt(i));
}
}
catch(Exception e)
{
System.out.print("");
}
}
}