package com.abhi.basics;

import java.io.File;

public class CreateFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\abhishek.chandru\\Documents\\NCM war\\loadcsv.sh");

        try {

            // create a new file with name specified
            // by the file object
            boolean value = file.createNewFile();
            if (value) {
                System.out.println("New Java File is created.");
            }
            else {
                System.out.println("The file already exists.");
            }
        }
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}
