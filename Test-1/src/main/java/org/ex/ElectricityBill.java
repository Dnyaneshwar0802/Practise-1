package org.ex;

import java.util.Scanner;

/*Write a program to calculate electricity charges based on units consumed:
o First 100 units: ₹5/unit
o Next 100 units: ₹7/unit
o Beyond 200 units: ₹10/unit*/
public class ElectricityBill {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Units to get bill");
	int unit=sc.nextInt();
	if(unit>0) {
		if(unit<=100) {
			System.out.println("Your bill is "+unit*5);
		}else if(unit>100 &&unit<=200) {
			System.out.println("Your bill is >>"+unit*7);
		}
		else if(unit >200) {
			System.out.println("Your Bill is >>"+unit*10);
		}
	}else {
		System.out.println("Wrong input");
	}
}
}
