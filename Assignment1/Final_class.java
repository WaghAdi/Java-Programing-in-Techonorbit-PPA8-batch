/*
Que:-Write a java program to illustrate final in java. (Final - field, method, outer 
class)

Owner :- Wagh Aditya.
Batch:- PPA09.
*/


final class Parents
{
	int a=10;
	static int b=20;
	public static void main(String args[])
	{
		System.out.println("Inside parents");
	}
}

/*
cannot inherit from final Parents

class child extends Parents
{
	public static void main(String args[])
	{
		System.out.println("Inside child");
	}
}

*/
class child
{
	public static void main(String args[])
	{
		System.out.println("Inside child");
		Parents p=new Parents();
		System.out.println(p.a);
	}
}