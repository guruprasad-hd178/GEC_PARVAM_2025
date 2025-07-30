package inheritance;

class Vehicle {
	public String brand;
	public String models;

	public Vehicle(String brand, String models) {
		super();
		this.brand = brand;
		this.models = models;
	}

	public void starts() {
		System.out.println(brand + " " + models + " is starting");
	}
}

class Car extends Vehicle {
	public int wheels;

	public Car(String brand, String models, int wheels) {
		super(brand, models);
		this.wheels = wheels;
	}

	public void starts() {
		System.out.println(brand + " " + models + " is starting and has " + wheels + " wheels");
	}
}

public class Inheritance1 {
	public static void main(String[] args) {
		Car c1 = new Car("rover", "r1", 4);
		c1.starts();
	}

}
