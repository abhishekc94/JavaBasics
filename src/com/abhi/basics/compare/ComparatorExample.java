package com.abhi.basics.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentExample {
    int rollNo;
    String name;
    int age;

    StudentExample(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentExample{" + "rollNo=" + rollNo + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}

class RollNoComparator implements Comparator<StudentExample> {

    @Override
    public int compare(StudentExample s1, StudentExample s2) {
        if (s1.rollNo == s2.rollNo)
            return 0;
        else if (s1.rollNo > s2.rollNo)
            return 1;
        else
            return -1;
    }
}
class AgeComparator implements Comparator<StudentExample> {

    @Override
    public int compare(StudentExample s1, StudentExample s2) {
        if (s1.rollNo == s2.rollNo)
            return 0;
        else if (s1.rollNo > s2.rollNo)
            return 1;
        else
            return -1;
    }
}

class NameComparator implements Comparator<StudentExample> {

    @Override
    public int compare(StudentExample s1, StudentExample s2) {
        return s1.name.compareTo(s2.name);
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<StudentExample> al=new ArrayList<StudentExample>();
        al.add(new StudentExample(101,"Vijay",23));
        al.add(new StudentExample(106,"Ajay",27));
        al.add(new StudentExample(105,"Jai",21));

        Collections.sort(al,new NameComparator());
        al.forEach(s -> System.out.println(s));

        Collections.sort(al,new AgeComparator());
        al.forEach(s -> System.out.println(s));
    }
}
