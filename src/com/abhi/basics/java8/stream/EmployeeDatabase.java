package com.abhi.basics.java8.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getAllEmployee(){
        return Stream.of(
            new Employee(1,"Abhi","A",1000000.00),
            new Employee(2,"Tejas","B",600000.00),
            new Employee(3,"Manu","B",500000.00),
            new Employee(4,"AK","A",2000000.00)
        ).collect(Collectors.toList());
    }
}
