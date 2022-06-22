package com.abhi.basics.java8.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample2 {

    Employee employee;
    public static void main(String[] args) {
        List<Employee> employeeList = EmployeeDatabase.getAllEmployee();

        List<String> employeeName = employeeList
                                        .stream()
                                        .map(employee -> employee.getName())
                                        .collect(Collectors.toList());
        System.out.println("employee names "+employeeName);

        List<Employee> aGradeEmployeeList = employeeList
            .stream()
            .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
            .collect(Collectors.toList());
        System.out.println("A grade employee details "+aGradeEmployeeList);

        List<String> aGradeEmployeeName = employeeList
            .stream()
            .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
            .map(employee -> employee.getName())
            .collect(Collectors.toList());
        System.out.println("A grade employee name "+aGradeEmployeeName);

        //To find max salary of employee using reduce
        Employee employee = employeeList.stream()
            .reduce((e1,e2)->e1.getSalary()>e2.getSalary()?e1:e2).get();
        System.out.println(employee);

        //To find max salary of employee using max
        employee = employeeList
            .stream()
            .max((e1,e2)->e1.getSalary()> e2.getSalary()?1:-1).get();
        System.out.println("using max "+employee);

        double averageSalary = employeeList
                                .stream()
                                .filter(employee1 ->employee1.getGrade().equalsIgnoreCase("A"))
                                .mapToDouble(employee1 -> employee1.getSalary())
                                .average().getAsDouble();
        System.out.println("average salary of employee "+averageSalary);

        double sumOfSalary = employeeList
            .stream()
            .mapToDouble(employee1 -> employee1.getSalary())
            .sum();
        System.out.println("sum "+sumOfSalary);

          employeeList
            .stream()
            .filter(employee1 -> employee1.getSalary()==600000.00)
             .forEach(System.out::println);

          //converting set into List
        Set<Employee> employeeSet = employeeList
                                      .stream()
                                        .collect(Collectors.toSet());
        System.out.println(employeeSet.size());

        // converting list to Map
        Map<Integer,Employee> map = employeeList.stream()
            .collect(Collectors.toMap(emp -> emp.getId(),emp ->emp));

        map.forEach((integer, emp) -> System.out.println(integer+" "+emp));

        System.out.println("employee "+employee);
    }
}
