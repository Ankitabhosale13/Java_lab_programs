//Slip25: (A)- Write a java program to check wheter the given string is Palidrome or not.
import java.util.Scanner;

public class slip25A {

	public static void main(String[] args) {
		
		String s = "leve";
		String rev = "";
		for (int i = s.length()-1; i >=0 ; i--) 
			rev=rev+s.charAt(i);
		if(s.equals(rev))
			System.out.println("String is palindrome");
		else 
			System.out.println("String is not palindrome");

	}

}
