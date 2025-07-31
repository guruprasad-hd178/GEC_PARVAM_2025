package polymorphism;

abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

public class Size
{
	public static void main(String[] args) {
		Shape s1 = new Circle(5);
		System.out.println(s1.area());
		
		Shape s2 = new Rectangle(4, 5);
		System.out.println(s2.area());
	}
}
