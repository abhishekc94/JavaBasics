package com.abhi.basics;

public class ReadOnlyClass {

    private String name = "Abhishek C";

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ReadOnlyClass readOnlyClass = new ReadOnlyClass();
        System.out.println(readOnlyClass.name);
    }
}
