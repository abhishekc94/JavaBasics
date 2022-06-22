package com.abhi.basics.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamBasicExample {
    public static void main(String[] args) {
        Stream.iterate(2,integer -> integer+1)
            .filter(integer -> integer%2==0)
            .limit(10)
            .forEach(System.out::println);

        List<Integer> integerList = new ArrayList<>(Arrays.asList(3,5,3,66,44,67,90));
        integerList.forEach(System.out::println);

        integerList.stream()
            .sorted().forEach(System.out::println);
    }
}
