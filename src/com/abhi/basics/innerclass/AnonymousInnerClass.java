package com.abhi.basics.innerclass;

abstract class InnerAnonymous {
    public abstract void eat();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        InnerAnonymous innerAnonymous = new InnerAnonymous() {
            @Override
            public void eat() {
                System.out.println("Eating");
            }
        };
        innerAnonymous.eat();
    }
}
