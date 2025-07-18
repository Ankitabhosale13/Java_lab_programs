class addition
{
int sum=0;

public int addtwo_no(int a , int b)
{
sum=a+b;
return sum;
}

public static void main(String args[])
{
addition a1=new addition();
int s=a1.addtwo_no(10,20);
System.out.println("Addition of two numbers:" +s);
}
} 



