package com.abhi.basics.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class WithoutStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000.00));
        productsList.add(new Product(2,"Dell Laptop",30000.00));
        productsList.add(new Product(3,"Lenevo Laptop",28000.00));
        productsList.add(new Product(4,"Sony Laptop",28000.00));
        productsList.add(new Product(5,"Apple Laptop",90000.00));

        List<Product> productsListPrice = new ArrayList<Product>();

        productsList.forEach(product -> {
            if(product.getPrice()>=30000) {
                productsListPrice.add(product);
            }
        });

        productsListPrice.forEach(System.out::println);

        Product product = productsList.stream().max(
            (product1,product2) ->
                product1.getPrice()>product2.getPrice()?1:-1).get();
        System.out.println("Max product object "+product);
    }
}
