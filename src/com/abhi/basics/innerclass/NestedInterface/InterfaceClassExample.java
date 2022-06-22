package com.abhi.basics.innerclass.NestedInterface;

interface NestedClass {

     int x = 10;

    class Example {
        static void sayHello() {
            System.out.println("Good Morning");
        }
    }
}
public class InterfaceClassExample implements NestedClass{

    public static void main(String[] args) {
        NestedClass.Example.sayHello();
    }
}
