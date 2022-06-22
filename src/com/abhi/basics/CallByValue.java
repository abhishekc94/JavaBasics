package com.abhi.basics;

public class CallByValue {

    private int data = 50;
    // calling method by sending value
    void change(int data) {
        this.data = this.data + data;
    }

    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        System.out.println("Before change "+callByValue.data);
        callByValue.change(100);
        System.out.println("After change "+callByValue.data);
    }
}
