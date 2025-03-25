package oops_assignment;

abstract class Employee {
    protected String name;
    
    public Employee(String name) {
        this.name = name;
    }
    
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private double salary;

    public FullTimeEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;
    }

	public void getsalary() {
		System.out.println(salary);
	}
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    
    public void getsalary() {
		System.out.println(hourlyRate * hoursWorked);
	}
}

public class Employees{
	public static void main(String[] args) {
		PartTimeEmployee pe1 = new PartTimeEmployee("reva", 350, 4);
		pe1.calculateSalary();
		pe1.getsalary();

		FullTimeEmployee fe1 = new FullTimeEmployee("veda", 45000);
		fe1.calculateSalary();
		fe1.getsalary();
	}
}
