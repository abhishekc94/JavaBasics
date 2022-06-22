package com.abhi.basics;

public class ImmutableString {
    public static void main(String[] args) {
        String s = "Abhi";
        s.concat("Kanchan");//concat() method appends the string at the end
        System.out.println(s);//will print Abhi because strings are immutable objects

        StringBuffer stringBuffer = new StringBuffer("Abhi");
        StringBuffer stringBuffer1 = new StringBuffer("Abhi");
        System.out.println(stringBuffer.equals(stringBuffer1));

        String s1 = "Abhi";
        String s2 = "Abhi";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("Abhi");
        String s4 = new String("Abhi");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
}
