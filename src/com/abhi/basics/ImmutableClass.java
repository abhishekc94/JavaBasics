package com.abhi.basics;

public final class ImmutableClass {

    private final String panCardNo = "BLVPA3637E";

    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass();
        System.out.println(immutableClass.panCardNo);
    }


}
