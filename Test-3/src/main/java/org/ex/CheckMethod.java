package org.ex;

//1. Design method to check whether the character is alphabet, digit and special symbol.

import java.util.Scanner;

//package name must start with com.companyname.clintname.etc
    //import java class so we take input
public class CheckMethod { //main class
    void check(int no) { //creating method


    }

    public static void main(String[] args) {
        System.out.println("Enter char/digit/special Syambol");
        //create Scanner class object
        Scanner scanner=new Scanner(System.in); //in is for input
        //we take value But JVM will convert it into ASCII code direct
        String str=scanner.next(); //Ashd --A AShsjs-A-Number
        char ch=str.charAt(0);// a A 12
        int ascii=ch; //A=Acii Change char int
        System.out.println("Ascii value " +ascii);
        //System.out.println(ch); //checking we getting op or not
        int N=scanner.next().charAt(0);
        //Number=     Pooja.P
    }

}
