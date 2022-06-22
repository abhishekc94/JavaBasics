package com.abhi.basics;

public class ThisExample implements Cloneable{

    private int id;
    private String name;
    private double marks;

    ThisExample() {
        System.out.println("Hello world");
    }

    ThisExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    ThisExample(int id, String name,double marks) {
        this(id,name);
        this.marks = marks;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ThisExample thisExample = new ThisExample(10,"Abhi");
        ThisExample thisExample1 = (ThisExample) thisExample.clone();
        System.out.println(thisExample.id+" "+thisExample.name);
    }

}
