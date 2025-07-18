//Slip5-1.Write a java program to display following pattern.
//5
//4 5
//3 4 5
//2 3 4 5
//1 2 3 4 5


class pattern
{
	public static void main(String args[])
{
	int i,j;
	for(i=5;i>=1;i--)
{
	for(j=i;j<=5;j++)
{
	System.out.print(j);
}
	System.out.println();
}
}
}