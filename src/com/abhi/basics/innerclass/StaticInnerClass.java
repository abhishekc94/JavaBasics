package com.abhi.basics.innerclass;

public class StaticInnerClass {

    private static int value = 30;

    private static void display() {
        System.out.println("Hello world");
    }

    private static class Inner {
        public static void innerDisplay() {
            display();
            System.out.println("Hello inner world");
        }
    }

    public static void main(String[] args) {
        Inner.innerDisplay();
    }
}
