/*
Que:-1. Write a java program to find out factorial of given number. (Using Scanner class).

Owner :- Wagh Aditya.
Batch:- PPA09.
*/


import java.util.Scanner;

class Factorial
{ 
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number whose factorial want to find");
		int num=sc.nextInt();
		Factorial f=new Factorial();
		f.factorial(num);
	}
	void factorial(int n)
	{   int fact=1;
		for (int i=1; i<= n; i++)
		{
			fact=fact*i;
		}
		System.out.printf("the factorial of given number is %d",fact);
		
	}
}