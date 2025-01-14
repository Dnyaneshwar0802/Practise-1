package org.ex;

import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (negative to stop): ");
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
            }

        } while (number >= 0);

        System.out.println("The sum of all entered positive numbers is: " + sum);

    }
}
