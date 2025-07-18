//Slip 16 : (A)- Write a java program to calculate sum of digits of a given number using recursion.


import java.io.*;
 
class slip16A
{
    static int sum_of_digit(int n)
    {
        if (n == 0)
            return 0;
        return (n % 10 + sum_of_digit(n / 10));
    }
 
    public static void main(String args[])
    {
        int num = 232;
        int result = sum_of_digit(num);
        System.out.println("Sum of digits in " +  num + " is " + result);
    }
}
