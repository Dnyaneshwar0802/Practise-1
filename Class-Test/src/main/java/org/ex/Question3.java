package org.ex;

public class Question3 implements  Runnable{
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);
                try {
                    Thread.sleep(500); // Delay of 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    class NumberPrinterThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(getName() + " - " + i);
                try {
                    Thread.sleep(500); // Delay of 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

