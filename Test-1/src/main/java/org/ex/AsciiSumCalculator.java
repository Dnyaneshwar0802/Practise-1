package org.ex;

import java.util.Scanner;

//Write a program to calculate the sum of the ASCII values of all characters in a given string.
public class AsciiSumCalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int asciiSum=0;
   for(int i=0;i<input.length()-1;i++)
   {
	   asciiSum=asciiSum+input.charAt(i);
   }
   System.out.println("Sum of all char >>"+asciiSum);
	}
}
