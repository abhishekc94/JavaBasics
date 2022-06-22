package com.abhi.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {



    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}


public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Abhi");
        employee.setSalary(10000);
        ObjectOutputStream objectOutputStream =
            new ObjectOutputStream(new FileOutputStream("C:\\Users\\abhishek.chandru\\Downloads\\Springboot-tutorial"));
        objectOutputStream.writeObject(employee);
        System.out.println("Success");

        ObjectInputStream objectInputStream =
            new ObjectInputStream(new FileInputStream("C:\\Users\\abhishek.chandru\\Downloads\\Springboot-tutorial"));
        Employee employee1 = (Employee) objectInputStream.readObject();
        System.out.println(employee1);
        System.out.println("Success");
    }
}
