package org.ex;

public class MultiThreadingExample {
        public static void main(String[] args) {
            Thread thread1 = new Thread(new Question3(), "RunnableThread");


            Thread thread2 = new NumberPrinterThread();
            thread2.setName("ThreadClassThread");

            thread1.start();
            thread2.start();
        }
    }
