package com.abhi.basics.java8.lambdaExpression;

public class LambdaExpressionCreatingThread {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i=0;i<10;i++) {
                try {
                    System.out.println(i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
    }
}
