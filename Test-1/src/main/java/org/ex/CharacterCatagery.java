package org.ex;

import java.util.Scanner;

/*Develop a program to categorize a given character as:
o Vowel (a, e, i, o, u)
o Consonant
o Digit
o Special Character
Use nested if statements.*/
public class CharacterCatagery {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Char to check");
	String str=sc.next();
str.toLowerCase();
	char c=str.charAt(0);
	 if (c >= 'a' && c <= 'z'){
	if(c=='a' ||c=='e' ||c=='i' || c=='o' ||c=='u') {
		System.out.println("entered charachter is vowel");
	}else {
        System.out.println("The character is a consonant");
    }
	}else if (c>= '0' && c <= '9') {
        System.out.println("The character is a digit");
    } else {
        System.out.println("The character is a special character");
    }
}
}

