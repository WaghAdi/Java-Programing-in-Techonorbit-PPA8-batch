/*
Que:- Write a java program to illustrate final in java. (Final - field, method, outer 
class)

Owner :- Wagh Aditya.
Batch:- PPA09.
*/

class Final
{
  final static int a=10;
  // final static int b;  not allowed   // variable b not initialized in the default constructor
  final static int b;
  static
  {
	b=20;
	//b=b+10;        //not allowed
  }
  
  
  final int c=19;
  //final int f;     // variable f might not have been initialized
  final int d; 
  final int e;
  
  {
	  d=20;
	  System.out.println("Inside a  non static block");
  }
  
  Final()
  { 
   // d=30;      //Not allowed  variable d might already have been assigned
   //c=c+1;      //cannot assign a value to final variable c
	System.out.println("Inside a constructor");
	e=49;
  }
  public static void main(String[] args)
  {
	System.out.println(Final.a);
	System.out.println(Final.b);
	//(Final.a)++;     //not allowed
	Final f1= new Final();
	System.out.println(f1.c);
	System.out.println(f1.d);
	
  }
}

