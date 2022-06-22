package com.abhi.basics.switchex;

public class SwitchExample1 {
    public static void main(String[] args) {
        int month = 10;
        String monthAl="";

        switch (month) {
            case 1:
                monthAl = "January";
                break;
            case 2:
                monthAl = "February";
                break;
            case 3:
                monthAl = "March";
                break;
            case 4:
                monthAl = "April";
                break;
            case 5:
                monthAl = "May";
                break;
            case 6:
                monthAl = "June";
                break;
            case 7:
                monthAl = "July";
                break;
            case 8:
                monthAl = "August";
                break;
            case 9:
                monthAl = "September";
                break;
            case 10:
                monthAl = "October";
                break;
            case 11:
                monthAl = "November";
                break;
            case 12:
                monthAl = "December";
                break;
            default:
                monthAl = "Invalid Month";
        }
        System.out.println(month+" "+monthAl);
    }
}
