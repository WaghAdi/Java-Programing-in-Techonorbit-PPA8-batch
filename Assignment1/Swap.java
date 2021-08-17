/*
Que:Write a java program to swap two integer numbers. (Using Command Line Arguments).
Owner :- Wagh Aditya.
Batch:- PPA09.
*/


class Swap
{
	public static void main(String args[])
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		System.out.println("Before Swaping");
		System.out.printf("x =%d and y = %d \n",x,y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("After Swaping");
		System.out.printf("x =%d and y = %d \n",x,y);
	}
}