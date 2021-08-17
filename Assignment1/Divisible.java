/*
Que:- Write a java program to accept one integer from user and check whether 
given number is divisible by 7 or not (using divisibility condition

Owner :- Wagh Aditya.
Batch:- PPA09.
*/
import java.util.Scanner;

class Divisible
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number want to cheak divisible by 7 or not ");
		int num=sc.nextInt();
		Divisible d=new Divisible();
		d.cheakDivisible(num);
	}
	void cheakDivisible(int n)
	{
		if (n<71)
		{
			if(n%7 ==0)
			{
				System.out.println("Given number is divisible by 7");
			}
			else
			{
				System.out.println("Given number is not divisible by 7");
			}
		}
		else
		{
			int temp=n%10;
			n=n/10;
			n=n-(temp*2);
			cheakDivisible(n);
		}
	}
}