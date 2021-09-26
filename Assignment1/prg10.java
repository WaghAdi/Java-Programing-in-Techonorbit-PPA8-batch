/*
Que:- .Write a java program to which accept one string and one character from user and 
print count of given char in string

Owner :- Wagh Aditya.
Batch:- PPA09.
*/


import java.util.Scanner;
class Prg10
{
	public static void main(String args[])
	{   int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str=sc.nextLine();
		System.out.println("Enter character");
		char character=sc.next().charAt(0);
		for (int i=0;i<str.length();i++)
		{
			if (str.charAt(i)==character)
			{
				count+=1;
			}
		}
		System.out.printf("given character is present %d times in given string ",count);
		
	}
}