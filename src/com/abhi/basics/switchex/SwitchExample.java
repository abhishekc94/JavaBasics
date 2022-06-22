package com.abhi.basics.switchex;

public class SwitchExample {

    public static void main(String[] args) {
        int number = 20;

        switch (number) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            default:
                System.out.println("Not in range");
        }
    }
}
