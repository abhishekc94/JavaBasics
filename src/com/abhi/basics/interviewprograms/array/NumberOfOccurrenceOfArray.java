package com.abhi.basics.interviewprograms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberOfOccurrenceOfArray {

    public static void main(String[] args) {
        int array[] = {5,1,2,2,3,3,3,4,4,4,4,99,99,100};

        int count[] = new int[128];
        ArrayList ai = new ArrayList();
        Arrays.stream(array).sorted();
        for(int i =0;i<array.length;i++) {
            count[array[i]]++;
        }
        for (int i =0;i<=99;i++){
            if(count[i]>=1)
            System.out.println(i+" present "+count[i]+" times");
        }
    }
}
