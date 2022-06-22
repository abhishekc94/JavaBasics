package com.abhi.basics.recusion;

public class FactorialUsingRecursion {

    static int factorial = 1;

    static int factorial(int number) {
        int factorial = 1;
        while(number>1) {
            factorial = factorial*number;
            number--;
        }
        return factorial;
    }

    static int factorialByUsingRecursion(int number) {
        if(number>1) {
            factorial = number*factorial;
            number--;
            factorialByUsingRecursion(number);
        }
        return factorial;
    }

    static int factNum(int num) {
        if (num == 1)
            return 1;
        else{
            return num*factNum(num-1);
        }

    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of "+number+" is "+factNum(number));
        System.out.println("Factorial of "+number+" is "+factorialByUsingRecursion(number));
    }
}
