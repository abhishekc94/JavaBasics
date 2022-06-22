package com.abhi.basics.thread;
class Customer {

    private int amount = 10000;

    synchronized void withdrawAmount(int amount) {
        System.out.println("going to withdraw");
        if(this.amount<amount) {
            System.out.println("Less balance waiting for deposit");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.amount-=amount;
        System.out.println("deposit completed");
    }

    synchronized void depositAmount(int amount) {
        System.out.println("going to deposit");
        this.amount+=amount;
        System.out.println("deposit completed");
        notify();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Customer customer = new Customer();
        new Thread() {
            public void run() {
                customer.withdrawAmount(15000);
            }
        }.start();

        new Thread() {
            public void run() {
                customer.depositAmount(10000);
            }
        }.start();
    }
}
