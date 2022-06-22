package com.abhi.basics.collections.map;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIteratorExample {

    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> map = new ConcurrentHashMap<>();
        map.put(1,"ONE");
        map.put(1,"ONE");
        map.put(1,"ONE");
        map.put(1,"ONE");
        System.out.println(map.size());
        for (Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
            map.put(2,"Two");
        }
        System.out.println(map.size());
    }
}
