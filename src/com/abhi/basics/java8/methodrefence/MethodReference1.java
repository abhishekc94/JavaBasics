package com.abhi.basics.java8.methodrefence;

interface Sayable {
    void say();
}
public class MethodReference1 {
    public static void SaySomething() {
        System.out.println("Hello Good Morning");
    }

    public static void main(String[] args) {
        Sayable sayable = MethodReference1::SaySomething;
        sayable.say();
    }
}
