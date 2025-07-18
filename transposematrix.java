import java.util.Scanner;
class transposematrix
{
public static void main(String args[])
{
int arr[][]=new int[2][2];
Scanner r=new Scanner(System.in);
System.out.print("Enter Array Elements:");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
arr[i][j]=r.nextInt();
}
}
System.out.print("Array Matrix:");
System.out.print("\n");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.print("\n");
}
System.out.print("Array Transpose Matrix:");
System.out.print("\n");
for(int i=0;i<=1;i++)
{
for(int j=0;j<=1;j++)
{
System.out.print(arr[j][i]+" ");
}
System.out.print("\n");
}
}
}