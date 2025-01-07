package org.ex;

import java.util.Scanner;

/*Write a program to swap two numbers without using a third variable or arithmetic
operators.*/
public class NumberSwap {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("Enter the first number");
     int num1 = scanner.nextInt();

     System.out.print("Enter the second number");
     int num2 = scanner.nextInt();
     System.out.println("Number before swap num1 >>"+num1+" >> Num2 >>"+num2);
     num1=num1+num2;
     num2=num1-num2;
     num1=num1-num2;
     System.out.println("Number after swap num1 >>"+num1+" >> Num2 >>"+num2);
}
}
