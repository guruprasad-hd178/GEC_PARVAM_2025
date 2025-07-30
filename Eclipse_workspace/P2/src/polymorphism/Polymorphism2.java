package polymorphism;

class Shape
{
	public void area() 
	{
		System.out.println("the area is : ");
	}
}

class Circle extends Shape
{
	int radius;
	double pi = 3.14;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public void area()
	{
		System.out.println("Circle area is : " +(pi * radius * radius));
	}
}

class Square extends Shape
{
	int length;
	
	public Square(int length) {
		super();
		this.length = length;
	}
	
	public void area()
	{
		System.out.println("Square area is : " +(length * length));
	}
}

class Rectangle extends Shape
{
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public void area()
	{
		System.out.println("Rectangle area is : " +(length * breadth));
	}
}

public class Polymorphism2 {
	public static void main(String[] args) {
		Shape c1 = new Circle(5);
		c1.area();
		
		Shape s1 = new Square(5);
		s1.area();
		

		Square s2  = (Square) s1;
		s2.area();
		
		Shape r1 = new Rectangle(3, 4);
		r1.area();
	}
}
