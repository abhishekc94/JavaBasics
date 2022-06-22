package com.abhi.basics.collections.map;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorExample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Abhi");
        list.add("Tejas");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add("Sukku");
        }
    }
}
