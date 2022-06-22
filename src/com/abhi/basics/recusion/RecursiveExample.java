package com.abhi.basics.recusion;

public class RecursiveExample {
    void p() {
        System.out.println("hello");
        p();
    }

    public static void main(String[] args) {
        RecursiveExample recursiveExample = new RecursiveExample();
        recursiveExample.p();
    }
}
