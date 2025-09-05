package com.springbootdependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private final String name;
    private final Address addressOne;

    // ✅ Constructor Injection
    public Employee(@Qualifier("address2") Address addressOne) {
        this.name = "Default Employee"; 
        this.addressOne = addressOne;
        System.out.println("Employee object created with Address dependency");
    }

    public String getName() {
        return name;
    }

    public Address getAddressOne() {
        return addressOne;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', address=" + addressOne.getName() + "}";
    }
}
