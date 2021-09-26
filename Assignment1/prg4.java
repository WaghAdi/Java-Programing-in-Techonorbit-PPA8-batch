
/*
Que:- Write a java program to which is going to  accept one string from user and print all characters 
from string. (Using BufferedReader class). charAt(i)


Owner :- Wagh Aditya.
Batch:- PPA09.
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;

class Demo
{
	public static void main(String args[]) throws Exception
	{
		System.out.println("Enter a String");
	    InputStreamReader ir= new InputStreamReader(System.in);
	     BufferedReader br = new BufferedReader(ir);
		String str=br.readLine();
		for (int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
	}
}