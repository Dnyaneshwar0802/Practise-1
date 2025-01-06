package org.ex;

import java.util.Scanner;

//Write a program to check if three numbers can form the sides of a valid triangle.

public class CheckingSidesofValidTriangle {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter the first side");
     double a = scanner.nextDouble();

     System.out.print("Enter the second side");
     double b = scanner.nextDouble();

     System.out.print("Enter the third side");
     double c = scanner.nextDouble();
     if (a + b > c && a + c > b && b + c > a) {
         System.out.println("The given sides form a valid triangle.");
     } else {
         System.out.println("The given sides do not form a valid triangle.");
     }
}
}
