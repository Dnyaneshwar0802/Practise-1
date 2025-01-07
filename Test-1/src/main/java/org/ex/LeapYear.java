package org.ex;

import java.util.Scanner;

/*Implement a program to determine if a given year is a "Century Leap Year."
Century Leap Year: A year divisible by 400.*/
public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Check year is leap or not");
	int checkYear=sc.nextInt();
	if(checkYear%4==0) {
		System.out.println("Entered year is LEAP YEAR");
	}else {
		System.out.println("NOT LEAP YEAR");
	}
}
}
