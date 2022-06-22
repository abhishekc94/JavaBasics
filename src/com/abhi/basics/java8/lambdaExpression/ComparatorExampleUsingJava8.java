package com.abhi.basics.java8.lambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name='" + name + '\'' + ", price=" + price + '}';
    }
}
public class ComparatorExampleUsingJava8 {
    public static void main(String[] args) {

        List<Product> list=new ArrayList<Product>();

        //Adding Products
        list.add(new Product(1,"HP Laptop",25000f));
        list.add(new Product(3,"Keyboard",300f));
        list.add(new Product(2,"Dell Mouse",150f));

        Collections.sort(list,(p1,p2) -> {
            if (p1.id== p2.id)
                return 0;
            else if (p1.id>p2.id)
                return 1;
            else return -1;
        });
        list.forEach(product-> System.out.println(product));

       /* Collections.sort(list,(s1,s2)-> s1.name.compareTo(s2.name));
        list.forEach(product -> System.out.println(product));*/
    }
}
