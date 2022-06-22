package com.abhi.basics;

public class StaticBinding {

    private void staticBinding() {
        System.out.println("static Binding Example");
    }

    public static void main(String[] args) {
        StaticBinding staticBinding = new StaticBinding();
        staticBinding.staticBinding();
    }
}
