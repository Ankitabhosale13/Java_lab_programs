//Slip14:(A)-Write a Java program to find the power of a number using Recursion.

class slip14A {

	// Function to calculate N raised to the power P
	static int power(int N, int P)
	{
		if (P == 0)
			return 1;
		else
			return N * power(N, P - 1);
	}


	public static void main(String[] args)
	{
		int N = 5;
		int P = 3;

		System.out.println(power(N, P));
	}
}
