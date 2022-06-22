package com.abhi.basics.thread;

class Numbers {

    int counter = 1;

    static int N = 10;

    synchronized void printOddNumber() throws InterruptedException {
        while (counter < N) {
            // If count is even then print
            while (counter % 2 == 0) {
                // Exception handle
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // Print the number
            System.out.print(counter + " ");
            // Increment counter
            counter++;
            // Notify to second thread
            notify();
        }
    }

    synchronized void printEvenNumber() throws InterruptedException {
        // Print number till the N
        while (counter < N) {
            // If count is odd then print
            while (counter % 2 == 1) {
                // Exception handle
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            // Print the number
            System.out.print(counter + " ");
            // Increment counter
            counter++;
            // Notify to 2nd thread
            notify();
        }
    }
}
public class InterThreadCommunicationToPrintOddAndEven {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        new Thread() {
            public void run() {
                try {
                    numbers.printOddNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            public void run() {
                try {
                    numbers.printEvenNumber();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
