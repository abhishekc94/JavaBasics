package com.abhi.basics.java8.stream.mapandflatmap;

public class Bike {

    int a;
    int b;

    public Bike(int a) {
        this.a = a;
    }

    public Bike(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a);
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Bike b1 = new Bike(10);
        Bike b2 = new Bike(30,20);
        b1.display();
        b2.display();
    }
}
