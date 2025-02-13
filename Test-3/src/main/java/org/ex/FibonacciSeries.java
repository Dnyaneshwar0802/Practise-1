package org.ex;//2. Write a java program to display the Fibonacci series up to given number

import java.util.Scanner;

public class FibonacciSeries {
    void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number to Get a Series");
        int N = scanner.nextInt();
        if (N > 1) {
            printSeries(N);
        } else {
            System.out.println("You entered value is 0 or 1");
        }

    }

    static void printSeries(int num) {
        System.out.print("0," + "1");
        int X = 0, Y = 1, Z=0;

        for (int i = 1; i < num - 1; i++) {
            Z= X + Y;
            X=Y;
            Y=Z;
            System.out.print("," + Z);

        }
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.userInput();
    }
}
