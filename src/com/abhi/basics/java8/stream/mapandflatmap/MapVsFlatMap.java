package com.abhi.basics.java8.stream.mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {
        List<Customer> customerList = EkartDatabase.customers();

        boolean result =
            customerList.stream().anyMatch(customer -> customer.getEmail().equalsIgnoreCase("abhi@gmail.com"));
        System.out.println(result);
        //to print emailId of all customers

        //List<Customer> convert into List<String> -> Data transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail() one to one mapping
        List<String> stringList =
            customerList.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(stringList);

        //customer -> customer.getPhoneNumbers() -> one to many mapping
        List<List<String>> phoneNumbers =
            customerList.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        List<String> phoneNumber = customerList.stream()
            .flatMap(customer -> customer.getPhoneNumbers().stream())
            .collect(Collectors.toList());
        System.out.println(phoneNumber);
    }
}
