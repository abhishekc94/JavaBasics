package com.abhi.basics.recusion;

public class Print1to10withoutUsingLoop {

    private static int count = 1;

    static void print() {
        if (count<=10) {
            System.out.println(count);
            count++;
            print();
        }
    }

    public static void main(String[] args) {
        print();
        System.out.println("Printing is completed");
    }
}
