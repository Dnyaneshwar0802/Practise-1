package org.ex;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number >> ");
        int num=sc.nextInt();
        int originalNumber = num;
        int reversed = 0;
        while (num != 0) {
            int temp = num % 10;
            reversed = reversed * 10 + temp;
            num = num / 10;
        }

        if (originalNumber == reversed) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
