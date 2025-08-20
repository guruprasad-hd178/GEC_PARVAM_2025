package innerclass;

import innerclass.University1.Department;

class University1 {
	class Department {
		public String name = "Hi";
	}
}

public class InnerClass3 {
	public static void main(String[] args) {
		University1 u1 = new University1();
		Department dept = u1.new Department();
		System.out.println(dept.name);
	}
}
