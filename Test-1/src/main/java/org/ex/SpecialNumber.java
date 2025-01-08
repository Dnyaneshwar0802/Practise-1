package org.ex;

import java.util.Scanner;

/*Create a program that determines if a given 3-digit number is "special." A number is
considered special if the sum of the factorial of its digits equals the number itself.*/
public class SpecialNumber {
	private static int factorial(int rem) {
		int fact=1;
     for(int i=1;i<=rem;i++) {
    	 fact=fact*i;
     }
    // System.out.println("Factorial of num >>"+rem +" >>"+fact);
     return fact;
	}
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter a 3-digit number");
     int num = sc.nextInt();
     if (num < 100 || num > 999) {
         System.out.println("Please enter a valid 3-digit number");
     }
     int temp=num;
     int sumFact = 0;
    for(int i=1;i<=3;i++) { //145
    	int rem=temp%10;
    	sumFact=sumFact+factorial(rem);
    	temp=temp/10;
    }
    if(sumFact==num) {
    	System.out.println("Entered Number is Special Number");
    } else {
    	System.out.println("NOT A SPECIAL NUMBER");
    }
}


}
