/*
Que:-1.2. Write a java program to check whether given number is prime or not. (Using 
Scanner class).

Owner :- Wagh Aditya.
Batch:- PPA09.
*/


import java.util.Scanner;

class Prime
{  
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		Prime p=new Prime();
		p.prime(num);
	}
	void prime(int n)
	{   int flag=0;
		for (int i=2; i<n; i++)
		{
			if(n%i == 0)
			{
				flag=1;
				System.out.println("Given number is not prime");
				break;
		
			}
		}
		if(flag==0)
		{
			System.out.println("Given number is prime");
		}
		
		
	}
}