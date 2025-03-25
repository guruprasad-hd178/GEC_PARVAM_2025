package oops_assignment;

class Student{
	private String name;
    private double marks;
	private int rollNumber;

    public Student(String name, int rollNumber, double marks) {
        this.setName(name);
        this.marks = marks;
        this.rollNumber = rollNumber;
    }

	public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public boolean hasPassed() {
    	if (this.marks >= 40)
    		return true;
    	else
    		return false;
    }

    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.rollNumber);
		System.out.println(this.marks);

	}
}

public class Students {
	public static void main(String[] args) {
		Student student = new Student("Guru", 13, 98);
		student.display();
		student.hasPassed();
	}
}
