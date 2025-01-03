package org.ex;

import java.util.Scanner;

/*5. Number Classification:
Write a program to classify a number as:
 Prime
 Palindrome
 Armstrong
Use nested if statements to implement these checks.*/

public class ChechNumber {
	private static void checkPrime(int num) {
		int flag = 0;
		if (num > 2) {
			if (num > 2) {
				for (int i = 2; i < num; i++) {
					if (num % i == 0) {
						flag = flag + 1;
					}
				}
			}
		} else {
			flag = 0;
		}
		if (flag > 0) {
			System.out.println("Entered number is NOT Prime");
		} else {
			System.out.println("Entered number is  prime");
		}
	}

	private static void pallindrom(int num) { // 121
		System.out.println("Inside method");
		int pal = 0;
		int i = 0;
		while (i >= 0) {
			// System.out.println(Inside loop);
			int rem = num % 10; // 1
			pal = pal * 10;
			pal = pal + rem;
			num = num - rem;
			num = num / 10;
			i++;
		}
		if (pal == num) {
			System.out.println("Number is Pallindrom");
		} else {
			System.out.println("number is not Pallindrom");
		}

	}

	private static void ArmStrong(int num) {
		int power = 0;
		int temp = num;
		int i = 0;
		while (i >= 0) {
			if (temp > 0) {
				temp = temp / 10;
				power = power + 1;
			} else {
				break;
			}
			i++;
		}
		int sum = 0;
		temp = num;
		for (int j = 0; j < power; j++) {
			int rem = temp % 10;
			for (int k = 2; k < power; k++) {
				rem = rem * rem;

			}
			sum = sum + rem;
			temp = temp / 10;
		}
		System.out.println("Sum of power is >> " + sum);
		if (sum == num) {
			System.out.println("Number is ArmStrong ");
		} else {
			System.out.println("Number is not ArmStrong");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number >>");
		int num = sc.nextInt();
		checkPrime(num);
		pallindrom(num);
		ArmStrong(num);
	}

}
