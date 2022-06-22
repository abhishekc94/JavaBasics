package com.abhi.basics.thread;

public class Thread1 extends Thread{

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        thread1.start();
    }
}
