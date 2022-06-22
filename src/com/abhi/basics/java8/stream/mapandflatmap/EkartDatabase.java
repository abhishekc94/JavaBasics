package com.abhi.basics.java8.stream.mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

    public static List<Customer> customers() {
        return Stream.of(
            new Customer(101,"Abhishek","abhi@gmail.com", Arrays.asList("9513017244,7019099024")),
            new Customer(102,"Manoj","manu@gmail.com", Arrays.asList("9513017244,7019099024")),
            new Customer(104,"Meghana","megha@gmail.com", Arrays.asList("9513017244,7019099024")),
            new Customer(103,"Meghana","megha@gmail.com", Arrays.asList("9513017244,7019099024"))
        ).collect(Collectors.toList());
    }
}
