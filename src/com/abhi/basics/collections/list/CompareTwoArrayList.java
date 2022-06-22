package com.abhi.basics.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CompareTwoArrayList {
    public static void main(String[] args) {
        //first array list
        ArrayList<String> firstList=new ArrayList<String>();
        //adds elements to the arraylist
        firstList.add("Apple");
        firstList.add("Pears");
        firstList.add("Guava");
        firstList.add("Mango");
        System.out.println(firstList);
        //second array list
        List<String> secondList=new ArrayList<String>();
        //adds elements to the arraylist
        secondList.add("Apple");
        secondList.add("Pears");
        secondList.add("Guava");
        secondList.add("Mango");
        System.out.println(secondList);


        boolean boolval = firstList.equals(secondList); //returns true because lists are equal
        System.out.println(boolval);

        secondList.add("Papaya");
        //again comparing both lists
        boolean bool = firstList.equals(secondList); //returns false because lists are not equal
        System.out.println(bool);

        System.out.println(firstList.stream().filter(secondList::contains).collect(Collectors.toList()));
    }
}
