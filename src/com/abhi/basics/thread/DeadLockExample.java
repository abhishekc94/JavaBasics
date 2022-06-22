package com.abhi.basics.thread;

public class DeadLockExample {

    public static void main(String[] args) {
        final String resource1 = "Printer";
        final String resource2 = "Scanner";

        Runnable r1 = () -> {
            synchronized (resource1) {
                System.out.println(Thread.currentThread().getName()+": locked "+resource1);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (resource2) {
                    System.out.println(Thread.currentThread().getName() + ": locked " + resource2);
                }
            }
        };

        Runnable r2 = () -> {
          synchronized (resource2) {
              System.out.println(Thread.currentThread().getName()+": locked "+resource2);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
              synchronized (resource1) {
                  System.out.println(Thread.currentThread().getName() + ": locked " + resource1);
              }
          }

        };

        Thread t1 = new Thread(r1);
        t1.setName("Desktop");

        Thread t2 = new Thread(r2);
        t2.setName("Laptop");

        t1.start();
        t2.start();
    }
}
