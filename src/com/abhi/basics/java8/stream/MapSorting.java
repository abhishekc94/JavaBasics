package com.abhi.basics.java8.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapSorting {
    public static void main(String[] args) {

        Map<Integer,String> integerStringMap = new HashMap<>();
        integerStringMap.put(1,"One");
        integerStringMap.put(3,"Three");
        integerStringMap.put(2,"Two");
        integerStringMap.put(5,"Five");
        integerStringMap.put(4,"Four");

        // by converting entrySet then we are sorting
        List<Entry<Integer,String>> entryList = new ArrayList<>(integerStringMap.entrySet());

        Collections.sort(entryList, Comparator.comparing(Entry::getKey));
        System.out.println(entryList);

        Collections.sort(entryList,
            Comparator.comparing(integerStringEntry -> integerStringEntry.getValue()));
        System.out.println(entryList);

        //by using stream
        //getting all values
        List<String> stringList = integerStringMap.entrySet()
                                        .stream()
                                         .map(integerStringEntry -> integerStringEntry.getValue())
                                            .collect(Collectors.toList());
        System.out.println(stringList);

        integerStringMap.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach(System.out::println);

        System.out.println(integerStringMap);
    }
}
