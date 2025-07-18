//Slip 16-(B) Write a java program to accept n employee names from user.
// Sort them in ascending order and Display them.
	//(use array of Object and Static keyword)


import java.util.*;

class slip16B
{
static String[] str=new String[5];                      //create a array of object
static Scanner sr= new Scanner(System.in);    //using scanner class for take a input for user
static ArrayList<String>list = new ArrayList<String>();

public static void main(String args[])
{
for(int i=0;i<str.length;i++)
{
System.out.print("Please Enter Employee Name:");
str[i]=sr.next();
list.add(str[i]);
}
Collections.sort(list);
System.out.println(list);

}
}