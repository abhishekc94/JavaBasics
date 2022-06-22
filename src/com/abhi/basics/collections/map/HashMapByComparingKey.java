package com.abhi.basics.collections.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapByComparingKey {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(103,"Vijay");
        map.put(102,"Rahul");

        map.entrySet().stream().forEach(System.out::println);
        map.entrySet()
            .stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
