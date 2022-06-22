package com.abhi.basics.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        //Printing the arraylist object
        System.out.println(list);

        //Traversing list through Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Traversing list through for-each loop
        System.out.println("");
        for (String fruits : list) {
            System.out.println(fruits);
        }

        Collections.sort(list);

        System.out.println(list);

        System.out.println("Using lambda expression");
        list.forEach(i -> {
            System.out.println(i);
        });
    }
}
