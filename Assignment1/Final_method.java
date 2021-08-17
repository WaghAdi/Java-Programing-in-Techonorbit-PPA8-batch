/*
Que:- Write a java program to illustrate final in java. (Final - field, method, outer 
class).

Owner :- Wagh Aditya.
Batch:- PPA09.
*/

class Car
{
	int a =10;
	static int b=20;
	final void price()
	{
		System.out.println("price method");
	}
}
class Showroom extends Car
{  //not allowed cannot override price method because it's final

  /* 
  
  void price()
   {
	   System.out.println("price method inside Showroom");
   }
   
   
   */


	public static void main(String[] args)
	{
		System.out.println("inside showroom main method");
		Car c1= new Car();
		c1.price();
	}
}