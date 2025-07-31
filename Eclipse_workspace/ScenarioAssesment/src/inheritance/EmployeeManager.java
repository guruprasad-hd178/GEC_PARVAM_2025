package inheritance;

class Employee {
    protected String name;
    protected double salary;
    protected String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + 
                          ", Salary: " + salary + 
                          ", Department: " + department);
    }
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, double salary, String department, int teamSize) {
        super(name, salary, department);
        this.teamSize = teamSize;
    }

    public void displayTeamSize() {
        System.out.println(name + " manages a team of " + teamSize + " employees");
    }
}

public class EmployeeManager
{
	public static void main(String[] args) {
		Employee e1 = new Employee("Guru", 500000, "cs");
		e1.displayDetails();
		
		Employee e2 = new Manager("Guru", 1000000, "cs", 10);
		e2.displayDetails();
	}
}
