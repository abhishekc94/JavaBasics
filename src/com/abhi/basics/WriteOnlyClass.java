package com.abhi.basics;

public class WriteOnlyClass {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        WriteOnlyClass writeOnlyClass = new WriteOnlyClass();
        writeOnlyClass.setName("Abhishek C");
    }
}
