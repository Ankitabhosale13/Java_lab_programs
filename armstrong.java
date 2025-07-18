//Slip 3-1.Write a java program to check wheter a given number is Armstrong or not.(use static keyword)
import java.util.Scanner;
public class Armstrong 
{
	
    	static int number ,check, rem, sum = 0;
   	public static void main(String args[])
 {
      	System.out.println("Enter the number to be verified:");
     	 Scanner sc = new Scanner(System.in);
    	  number = sc.nextInt();
     	 check = number;
      	while(check != 0)
 {
        	 rem = check % 10;
        	 sum = sum + (rem * rem * rem);
        	 check = check / 10;
 }
     	 if(sum == number)
        	 System.out.println("Given number is an armstrong number.");
     	 else
       	  System.out.println("Given number is not an armstrong number.");
 }
}
