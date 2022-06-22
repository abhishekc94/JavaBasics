package com.abhi.basics.java8.lambdaExpression;

@FunctionalInterface
interface Interface1 {
    int addTwoNumbers(int a,int b);
}

interface Addable {
    int addTwoNumbers(int a, int b);
}
public class LambdaExpression1 {

    public static void main(String[] args) {

        //Without using lambda expression
        Interface1 interface1 = new Interface1() {
            @Override
            public int addTwoNumbers(int a, int b) {
                return a+b;
            }
        };
        System.out.println(interface1.addTwoNumbers(1,4));

        //using lambda expression
        Interface1 interface11 = (a,b) -> {
            return a+b;
        };
        System.out.println(interface11.addTwoNumbers(10,8));

        Addable addable = (a,b) -> a+b;
        System.out.println(addable.addTwoNumbers(121,121));

    }
}
