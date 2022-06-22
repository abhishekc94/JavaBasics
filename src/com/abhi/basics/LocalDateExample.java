package com.abhi.basics;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate date = LocalDate.now();
        System.out.println(localDate.isLeapYear());
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);
        System.out.println("Year "+date.getYear());
        System.out.println(LocalDateTime.now().getHour());
    }
}
