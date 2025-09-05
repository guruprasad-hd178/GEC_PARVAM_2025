package com.springbootdependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDependencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDependencyApplication.class, args);
//		 Employee emp = (Employee)run.getBean("employee");
//		 System.out.println("Employee: "+emp);
//		 System.out.println("From employee: "+emp.getAddressOne());
//		 
//		 //first
//		 Address address = (Address)run.getBean("address");
//		 System.out.println("First Address"+address);
//		 Address address1 = (Address)run.getBean("address1");
//		 System.out.println("Sec Address"+address1);
//		 Address address2 = (Address)run.getBean("address2");
//		 System.out.println("Thir Address"+address2);
		
		// Get Employee bean from Spring Context
        Employee emp = run.getBean(Employee.class);
        System.out.println("Employee: " + emp);
        System.out.println("Employee Address: " + emp.getAddressOne().getName());

        // Check which Address beans exist
        Address address1 = (Address) run.getBean("address1");
        Address address2 = (Address) run.getBean("address2");

        System.out.println("Address1 bean: " + address1.getName());
        System.out.println("Address2 bean: " + address2.getName());
		
		 
	}

}
