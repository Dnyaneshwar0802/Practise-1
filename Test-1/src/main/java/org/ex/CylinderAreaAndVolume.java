package org.ex;

import java.util.Scanner;

/*Create a program that reads the dimensions of a cylinder (radius and height) and
calculates its surface area and volume.*/
public class CylinderAreaAndVolume {
public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the radius of the cylinder: ");
      double radius = scanner.nextDouble();

      System.out.println("Enter the height of the cylinder: ");
      double height = scanner.nextDouble();
      double surfaceArea = 2 * Math.PI * radius * (radius + height);
      double volume = Math.PI * Math.pow(radius, 2) * height;
      System.out.println("The surface area of the cylinder is: %.2f%n >>"+ surfaceArea);
      System.out.println("The volume of the cylinder is: %.2f%n >>"+volume);
}
}
