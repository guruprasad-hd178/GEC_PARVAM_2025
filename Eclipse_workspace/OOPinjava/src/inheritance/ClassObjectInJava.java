package inheritance;

class Student{
	//states
	public int age = 23;
	public String name = "guru";
	public double marks = 340.5;
	
	//actions
	public void isPlaying() {
		System.out.println(this.name+ " Student is playing");
	}
	public void isSleeping() {
		System.out.println(this.name+ " Student is playing");
	}
}

public class ClassObjectInJava {
	
	public static void main(String[] args) {
		/*
		 * class
		 * ========
		 * class will represent the state and behavior of an object
		 * state -> property
		 * behavior -> action
		 * 
		 * object:
		 * =========
		 * object is a implementation of class (state and action)
		 * 
		 * example:
		 * =========
		 * student
		 * 
		 * property:
		 * =========
		 * usn
		 * name
		 * branch
		 * age
		 * 
		 * action:
		 * =======
		 * isplaying()
		 * issleeping()
		 * 
		 * how to declare class and object
		 * =============================
		 * 
		 * class clas_name{
		 * 	state
		 * action
		 * }
		 * 
		 * ex
		 * class student{
		 * 	property;
		 * public int age = 30
		 * 
		 * action;
		 * public void isplaying(){
		 * syso("the student is playing")
		 */
		
		Student std1 = new Student();
		System.out.println(std1.age);
		System.out.println(std1.name);
		System.out.println(std1.marks);
		std1.isPlaying();
		std1.isSleeping();
		
	}
}
