package dependency_injection;

public class Employee {
	private String name;
	private Address address;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Employee(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}


	public static void main(String[] args) {
//		Field Injection
		
//		Employee employee = new Employee();
//		System.out.println("Before");
//		System.out.println(employee.name);
//		System.out.println(employee.address);
//		
//		Address address = new Address();
//		address.name = "bengaluru";
//		employee.name = "rohan";
//		employee .address = address;
//		
//		System.out.println("After");
//		System.out.println(employee.name);
//		System.out.println(employee.address.name);
		
//		Setter Injection
		
//		Address add = new Address();
//		add.setName("bengaluru");
//		Employee emp = new Employee();
//		emp.setName("rohan");
//		emp.setAddress(add);
//		System.out.println(emp.getName());
//		System.out.println(emp.getAddress().getName());
		
//		Constructor Injection
		
		Address add = new Address("bengaluru");
		Employee emp = new Employee("rohan", add);
		System.out.println(emp.getName());
		System.out.println(emp.getAddress().getName());
		
	}

}
