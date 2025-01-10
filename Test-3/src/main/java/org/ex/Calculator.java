package org.ex;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "WHat you want to do 1:addition \n 2:substraction \n 3:multiplication \n 4:division \n 5:modulas");
        int temp = sc.nextInt();
        System.out.println("enter first number >>");
        int num1 = sc.nextInt();
        System.out.println("enter second number >>");
        int num2 = sc.nextInt();
        switch(temp) {
            case 1:
                System.out.println("Sum is >> "+(num1+num2));
                break;
            case 2:
                System.out.println("sub is >> "+(num1-num2));
                break;
            case 3:
                System.out.println("mul is >> "+(num1*num2));
                break;
            case 4:
                if(num2!=0) {
                    System.out.println("div is >> "+(num1/num2));}
                else {System.out.println("it throw exception");}
                break;
            case 5:

                if(num2!=0) {
                    System.out.println("mod is >> "+(num1%num2));}
                else {System.out.println("it throw exception");}
                break;
            default:
                System.out.println("Invalid input !!");
        }
    }
}

