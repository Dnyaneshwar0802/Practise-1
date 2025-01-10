package org.ex;

import java.util.Scanner;
//Create a program that calculates the area of a rectangle. Take length and breadth as variables.
public class AreaofRectangle {
public static void main(String[] args) {
	int length;
	int width;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter length");
	length=sc.nextInt();
	System.out.println("Enter width");
	width=sc.nextInt();
	System.out.println("Area of rectangle is >>"+length*width);
}
}
