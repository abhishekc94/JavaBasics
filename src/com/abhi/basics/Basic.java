package com.abhi.basics;

public class Basic {

    Basic() {
        System.out.println("Hello World");
    }

    //If we create like this it will create object until memory exhaust So it will throw stack overflow error
    //make it as static before creating object it will resolve the issue
    static Basic basic = new Basic();

    public static void main(String[] args) {
        Basic basic = new Basic();
        String replace = "/var/opt/fds/ftp/celldata/cellid/;";
        replace = replace.replace(";","");
        System.out.println(replace);
    }
}
