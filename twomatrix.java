class twomatrix
{
public static void main(String args[])
{
int a[][]={ {1,2,3}, {4,5,6}, {7,1,2} };
int b[][]={ {3,4,6}, {5,6,7}, {8,9,10} };
int sum[][]=new int[3] [3];
int i, j;
System.out.println("Elements of First Matrix");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
System.out.print(a[i] [j] + " ");
}
System.out.println();
}
System.out.println("Elements of Second Matrix");
for(i=0; i<3; i++)
{
for(j=0; j<3; j++)
{
System.out.print(b[i] [j] + " ");
}
System.out.println(" ");
}
System.out.println("Addition of First and Second Matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
sum[i][j]=a[i] [j] + b[i] [j];
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(sum[i] [j] + " ");
}
System.out.println();
}
}
}