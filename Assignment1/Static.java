/*
Que:- Write a java program to illustrate static in java. (Static - block, field, method, 
inner class, import)

Owner :- Wagh Aditya.
Batch:- PPA09.
*/


class Static
{
  static int a=5;
  int b=10;
   public static void main(String[] args)
  {
    System.out.println(Static.a);
	// System.out.println(b);//Not allowed not static variable canot refered to static contex
	
	Static s= new Static(); //object creation
	System.out.println(s.a);
	System.out.println(s.b);
	
	(s.a)++;
	(Static.a)++;
	(s.b)++;
	System.out.println("After increament a and b are");
	System.out.println(s.a);
	System.out.println(s.b);
	//creating new object
	System.out.println("for s2 object and and b are as follows");
	Static s2= new Static();
	System.out.println(s2.a); //here a value remain same as for object which created before due to commanon memory got for a as it is static
	System.out.println(s2.b);
	
	
  }
  
  void non_static()
  {
	  System.out.println("Inside non static method");
	  System.out.println(this.b);
	  static_method();
  }
  
  static void static_method()
  {
	  System.out.println("Inside static method");
	  //System.out.println(b); //not allowed because this is not given as an argument to static method
	  Static s4=new Static();
	  System.out.println(s4.b); //allowed
		
  }
}

//for static method
class demo
{
	public static void main(String args[])
	{
		Static s3=new Static();
		s3.non_static();
		Static.static_method();//allowed 
		//Static.non_static() // not allowed because for non static method we need object
		
	}
	
}

// static block
class static_block
{  
   static int a=10;
   int b=20;
   static int c=fun();
   static int fun()
   {
	   System.out.println("Inside fun function");
	   System.out.println(static_block.a);
	   //System.out.println(static_block.b);   //error b is not static
	   return 15;
   }
   static
   {
	   System.out.println("Inside a static block 1");
   }
   public static void main(String args[])
   {
	   System.out.println("Inside main function");
   }
   static
   {
	   System.out.println("Inside a static block 2");
   }
	
}