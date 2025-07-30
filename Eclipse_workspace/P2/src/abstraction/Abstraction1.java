package abstraction;

abstract class Person
{
	public abstract void isWalking();
	
	public void isSleeping()
	{
		System.out.println("Person is sleeping");
	}
}

class Student extends Person 
{
	@Override
	public void isWalking() 
	{
		System.out.println("student is walking");
	}
	
}



interface Vehicle
{
	void start();
}

class Car implements Vehicle
{
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car is starting");
	}
	
}





public class Abstraction1 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.isWalking();
		s1.isSleeping();
		
		Car c1 = new Car();
		c1.start();
	}
}
