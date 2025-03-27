package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    String name;
    int roll_num;
    int age;

    public Student(String name, int roll_num, int age) {
        this.name = name;
        this.roll_num = roll_num;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", roll_num=" + roll_num + ", age=" + age + "]";
    }

    public int getAge() {
        return age;
    }
}

public class StreamsInJava3 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("gp", 12, 21));
        students.add(new Student("pg", 31, 32));
        students.add(new Student("hg", 13, 22));
        students.add(new Student("gh", 14, 19)); // This one has age < 20, should be excluded

        // Filtering students with age > 20
        List<Student> students_list = students.stream()
                .filter(student -> student.getAge() > 21)
                .collect(Collectors.toList());

        System.out.println(students_list);
    }
}
