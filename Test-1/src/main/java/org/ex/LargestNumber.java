package org.ex;

import java.util.Scanner;

//Implement a program to find the largest of three numbers using only relational and
//logical operators
public class LargestNumber {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		System.out.println("Enter 3rd number");
		int num3=sc.nextInt();
        int largestnumber;
        largestnumber=(num1>=num2 && num1>=num2)?num1:((num2>=num1 && num2>=num3)?num2:num3);
        System.out.println(">>"+largestnumber);
        
	}
}
