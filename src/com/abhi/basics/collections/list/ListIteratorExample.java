package com.abhi.basics.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> al=new ArrayList<String>();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
        al.add(1,"Sachin");

        ListIterator iterator = al.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous()+" ");
        }
    }
}
