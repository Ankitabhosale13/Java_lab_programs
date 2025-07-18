import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int a[]=new int[5];
Scanner r=new Scanner(System.in);
System.out.print("Enter elements in array");
for(int i=0;i<a.length;i++)
{
a[i]=r.nextInt();
}
System.out.print("array elements");
for(int i=0;i<a.length;i++)
{
System.out.print(a[i]+" ");
}
System.out.print("\narray reverse elements");
for(int i=a.length-1; i>=0;i--)
{
System.out.print(a[i]+" ");
}
}
}