package com.abhi.basics;

class Singleton {

    private static Singleton singleton = null;

    public static Singleton getInstance() {
        if (singleton == null) {
            System.out.println("Hi");
            singleton = new Singleton();
        }
        return singleton;
    }
}
public class SingletonExample {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);

    }
}
