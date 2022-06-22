package com.abhi.basics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream =
            new FileOutputStream("C:\\Users\\abhishek.chandru\\Downloads\\Springboot-tutorial");
        fileOutputStream.write(45);
        fileOutputStream.close();
        System.out.println("success");

        FileInputStream fileInputStream =
            new FileInputStream("C:\\Users\\abhishek.chandru\\Downloads\\Springboot-tutorial");
        int result = fileInputStream.read();
        System.out.println(result);
        fileInputStream.close();
    }
}
