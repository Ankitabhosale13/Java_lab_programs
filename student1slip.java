import java.io.*;
class student 
{
	int rollno;
	String name;
	Static int count;
}
student(int rno, String nm)
{
	rollno=rno;
	name=nm;
	count++;
	System.out.println(""+count);
}
public String toString()
{
	return "rno="+rollno+"nm ="+name;
}
public static void main(String args[])
{
int n,i,rno;
String nm;
