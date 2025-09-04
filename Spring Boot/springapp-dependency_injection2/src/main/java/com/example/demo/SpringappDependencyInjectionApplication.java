package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringappDependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringappDependencyInjectionApplication.class, args);
		Employee employee = (Employee) run.getBean("employee");
		Address address = (Address) run.getBean("address");
		
		System.out.println("Employee " +employee);
		System.out.println("Address " +address);
		address.name = "bengaluru";
		System.out.println("From employee ");
		System.out.println("From employee address name ");
	}

}
