package abstraction;

abstract class Vehicle {
    public abstract void start();
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting car with key ignition");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Starting bike with kick");
    }
}

public class Start
{
	public static void main(String[] args) {
		Vehicle v1 = new Car();
		v1.start();
		
		Vehicle v2 = new Bike();
		v2.start();
	}
}
