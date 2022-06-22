package com.abhi.basics.thread;

public class Thread3 {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is Running by anonymous class");
            }
        };
        Thread thread = new Thread(runnable);
        System.out.println(thread.getPriority()+" "+thread.getId()+" "+thread.getName());
        thread.start();

        Thread thread2 = new Thread(runnable);
        System.out.println(thread2.getPriority()+" "+thread2.getId()+" "+thread2.getName());
        thread2.start();
    }
}
