package com.abhi.basics;

public class InstanceOfOperatorExample {

    public static void main(String[] args) {
        InstanceOfOperatorExample instanceOfOperatorExample = new InstanceOfOperatorExample();
        if(instanceOfOperatorExample instanceof InstanceOfOperatorExample) {
            System.out.println(instanceOfOperatorExample instanceof InstanceOfOperatorExample);
        }
        System.out.println("Abhi" instanceof Object);
    }
}
