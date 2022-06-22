package com.abhi.basics.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForEachLoop {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("ankit");
        list.add("mayank");
        list.add("irfan");
        list.add("jai");

        list.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
