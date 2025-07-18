public class super
{
	int i,j;
	void show()
	{
		System.out.print("i and j: ");
		System.out.println( i+ " " +j);
	}
}

class sub extends super
{
	int k;
	void display()
	{
		System.out.println("k : " +k);
	}
	void sum()
	{
		System.out.println("i+j+k: " +(i+j+k));
	}
}
public class simpleinheritance
{
	public static void main(String args[])
	{
		super a= new super();
		sub b= new sub();
		a.i=5;
		a.j=12;
		System.out.println("Contents of super: ");
		a.show();
		System.out.println();
		b.i=11;
		b.j=13;
		b.k=17;
		System.out.println("Contents of sub :");
		b.show();
		b.display();
		System.out.println();
		System.out.println("Sum of i, j and k in sub :");
		b.sum();
	}
}