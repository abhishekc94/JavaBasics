package com.abhi.basics.java8.methodrefence;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Arithemetic {
    public static int add(int a, int b) {
        return a+b;
    }
}
public class MethodReference2 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> function = Arithemetic::add;
        int result = function.apply(2,1);
        System.out.println(result);
    }
}
