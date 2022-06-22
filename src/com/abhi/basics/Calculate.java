package com.abhi.basics;

public abstract class Calculate {

    Calculate() {
        System.out.println("Hi AM Constructor");
    }

    public abstract int calculate(int a,int b);

    public static void main(String[] args) {
        int result = new Calculate() {
            @Override
            public int calculate(int a, int b) {
                return a+b;
            }
        }.calculate(10,15);
        System.out.println(result);
    }
}


