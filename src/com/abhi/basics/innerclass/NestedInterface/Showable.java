package com.abhi.basics.innerclass.NestedInterface;

public interface Showable {

    void showable();

    interface Message {
        void msg();
    }

    public class Test implements Showable,Showable.Message{
        public static void main(String[] args) {
            Test test = new Test();

        }

        @Override
        public void msg() {
            System.out.println("Hello Good Morning!!");
        }

        @Override
        public void showable() {

        }
    }
}
