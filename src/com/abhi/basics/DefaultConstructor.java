package com.abhi.basics;

public class DefaultConstructor {

    private int id;
    private String name;

    public DefaultConstructor() {
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        DefaultConstructor  defaultConstructor = new DefaultConstructor();
    }
}
