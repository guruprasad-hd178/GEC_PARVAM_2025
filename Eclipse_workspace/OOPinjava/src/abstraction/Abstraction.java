package abstraction;

//1
interface  Animal{
	public void eat() ;
}

class Lion implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lion will eat meat");
	}
	
}

//2
abstract class Vehicle{
//	abm
	public abstract void start();
	
//	not abm
	public void stop() {
		System.out.println("The vehicle is stopped");
	}
}

class Car extends Vehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("car start with key");
	}
	
}


public class Abstraction {
	public static void main(String[] args) {
		/*
		 * Abstraction 
		 * ===========
		 * it is a process of hiding the implementation and
		 * showing only the essential resources
		 * 
		 * 2 ways
		 * ==========
		 * 1 interface (100%)
		 * 2 abstract class (0 - 100)
		 */
		Lion lion = new Lion();
		lion.eat();
		
		Car car = new Car();
		car.start();
		car.stop();
		
		Vehicle v  = new Vehicle() {
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("start ab 2");
			}
		};
		v.start();
		v.stop();
	}
}
