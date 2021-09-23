interface shapeProperty
{
	void calculateArea();
	void perimeter();
}
class Circle implements shapeProperty
{
	int r=5;
	public void calculateArea()
	{
		System.out.println("area of circle is "+3.14*r*r);
	}
	public void perimeter()
	{
		System.out.println("perimeter of circle is "+2*3.14*r);
	}
}
class Rectangle implements shapeProperty
{
	int l=6;
	int b=5;
	public void calculateArea()
	{
		System.out.println("area of rectangle is "+l*b);
	}
	public void perimeter()
	{
		System.out.println("perimeter of rectangle is 22");
	}
	
}

class shape
{
	public static void main(String args[])
	{   //for circle
		shapeProperty shape1=new Circle();
		shape1.calculateArea();
		shape1.perimeter();
	}
}