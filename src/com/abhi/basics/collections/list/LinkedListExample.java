package com.abhi.basics.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ravi");
        ll.add("Vijay");
        ll.add("Ajay");

        Iterator iterator = ll.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator reverseIterator = ll.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
