package com.abhi.basics.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
