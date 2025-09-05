package com.springbootdependency;

public class Address {
    private String name;

    public Address() {
        System.out.println("Address object created");
    }

    public Address(String name) {
        this.name = name;
        System.out.println("Address object created with name: " + name);
    }

    public String getName() {
        return name;
    }
}
