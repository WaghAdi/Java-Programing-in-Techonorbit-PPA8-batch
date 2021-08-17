/*
Que:- Write a java program to check whether given number is Armstrong or not. 
(Using Scanner class).

Owner :- Wagh Aditya.
Batch:- PPA09.
*/

import java.util.Scanner;

class Armstrong
{
	public static void main(String args[])
	{  
	    Armstrong a=new Armstrong();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int count=0;
		int number =num;
		while(number != 0)
		{
			count+=1;
			number=number/10;
		}
		
		a.armstong(num,count);
	}
	void armstong(int n,int digit)
	{   
	    int original=n;
	    int sum=0;
		while(n!=0)
		{
			int temp=n%10;
			int multiplication=1;
			for(int i=0; i<digit;i++)
			{
				multiplication=multiplication*temp;
			}
			sum+=multiplication;
			n=n/10;
		}
		if(sum==original)
		{
			System.out.println("Given number is armstong");
		}
		else
		{
			System.out.println("Given number is not armstong");
		}
	}
}