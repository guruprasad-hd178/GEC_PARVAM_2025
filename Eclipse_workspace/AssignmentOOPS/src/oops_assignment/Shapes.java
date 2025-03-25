package oops_assignment;

class Shape {
    public void calculateArea() {
        System.out.println("Area calculation not defined.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.println("Circle Area: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        System.out.println("Rectangle Area: " + (length * width));
    }
}

public class Shapes{
	public static void main(String[] args) {
		Circle circle = new Circle(5);
		circle.calculateArea();
		
		Rectangle rectangle = new Rectangle(5, 3);
		rectangle.calculateArea();
	}
}