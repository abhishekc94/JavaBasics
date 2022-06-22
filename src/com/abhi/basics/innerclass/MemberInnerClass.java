package com.abhi.basics.innerclass;

public class MemberInnerClass {

    private int data = 10;

    protected class Inner {

        void message() {
            int data = 30;
            System.out.println("print data "+data);
            System.out.println("print data "+new MemberInnerClass().data);
        }
    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
        Inner inner = memberInnerClass.new Inner();
        inner.message();
    }
}
