package com.abhi.basics.thread;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread2 thread2 = new Thread2();
        Thread thread = new Thread(thread2);
        thread.start();
    }
}
