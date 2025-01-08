package org.ex;

import java.util.Scanner;

/*Write a program to calculate the income tax payable based on the following slab:
	o Income <= 2,50,000: No Tax
	o Income > 2,50,000 and <= 5,00,000: 5%
	o Income > 5,00,000 and <= 10,00,000: 20%
	o Income > 10,00,000: 30%*/
public class TaxCalculator {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income");
	long income=sc.nextInt();
	if(income>0) {
	if(income<=250000) {
		System.out.println("NO TAX");
	}else if(income > 250000 && income<= 500000) {
		System.out.println("PAY TAX 5%");
	}else if(income > 500000 && income<= 1000000) {
		System.out.println("PAY TAX 20%");
	}else {
		System.out.println("Pay TAX 30%");
	}}else {
		System.out.println("Income is negative");
	}
}
}
