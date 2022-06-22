package com.abhi.basics;

class DynamicBindingExample {
     void dynamicBindingExample() {
        System.out.println("Dynamic binding parent example");
    }
}


public class DynamicBinding extends DynamicBindingExample {
     void dynamicBindingExample() {
        System.out.println("Dynamic binding child example");
    }

    public static void main(String[] args) {
        DynamicBindingExample dynamicBindingExample = new DynamicBinding();
        dynamicBindingExample.dynamicBindingExample();
    }
}
