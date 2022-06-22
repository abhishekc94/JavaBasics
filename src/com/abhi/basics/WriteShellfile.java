package com.abhi.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;

public class WriteShellfile {

    public static void main(String[] args) throws Exception {
        writeShellFile("C:\\Users\\abhishek.chandru\\Documents\\HTML","url");
    }
    private static void writeShellFile(String filePath,String param) throws Exception{

        File file = new File(filePath);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            StringBuffer sb = new StringBuffer();
            boolean newLine = false;
            while ((st = br.readLine()) != null) {
                if(newLine)
                    sb.append("\n");

                sb.append(st);

                if(!newLine)
                    newLine = true;
            }

            int start = sb.indexOf("sqlldr")+7;
            int end = start + sb.substring(start).indexOf(" ");

            sb.replace(start, end, param);

            OutputStream out = new FileOutputStream(filePath);
            out.write(sb.toString().getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
