package com.abhi.basics.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

    private int rollNo;
    private String name;
    private double marks;

    public Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.rollNo == student.rollNo)
            return 0;
        else if (this.rollNo > student.rollNo)
            return 1;
        else
            return -1;
    }
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        al.forEach(student -> System.out.println(student));
    }
}
