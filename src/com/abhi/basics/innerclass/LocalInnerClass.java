package com.abhi.basics.innerclass;

public class LocalInnerClass {

    private int data = 30;

    public void display() {
        System.out.println("display method");

        class Inner {
            private void display() {
                System.out.println("Inner Display msg "+data);
            }
        }
        Inner inner = new Inner();
        inner.display();
    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.display();
    }
}
