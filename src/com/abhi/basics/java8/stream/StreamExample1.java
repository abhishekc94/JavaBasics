package com.abhi.basics.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {

        //Stream<Integer> integerList = Stream.of(1,4,5,6,2,4);

        List<Integer> integerList = Arrays.asList(1,4,5,6,2,4);

        List<String> stringList = Arrays.asList("Abhi","Spring Boot","Java","Hibernate");
        int sum = 0;
        //To find sum of array normally
        for (Integer integer:integerList) {
            sum = sum + integer;
        }
        System.out.println("sum "+sum);

        //using mapToInt and sum
        int sum1 = integerList.stream().mapToInt(a->a).sum();
        System.out.println("sum1 "+sum1);

        //using reduce method with initial value
        int sum2 = integerList.stream().reduce(0,(a,b)->a+b);
        System.out.println("sum2 "+sum2);

        //using reduce method with initial value it will add to sum
        int sum3 = integerList.stream().reduce(1,(a,b)->a+b);
        System.out.println("sum3 "+sum3);

        //using reduce method
        int sum4 = integerList.stream().reduce((a,b)->a+b).get();
        System.out.println("sum4 "+sum4);

        int sum5 = integerList.stream().reduce(Integer::sum).get();
        System.out.println("sum5 "+sum5);

        int max = integerList.stream().reduce(Integer::max).get();
        System.out.println("max "+max);

        int max1 = integerList.stream().reduce((a,b)->a>b?a:b).get();
        System.out.println("max1 "+max1);

        String  maxLengthWord = stringList.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
        System.out.println("max Length Word is "+maxLengthWord);
    }
}
