package org.ex;

import java.util.Scanner;

public class ReverseNumber1 {
    public int getReverseNumber(int num) {
        int N=num;     //passed number 12345

        for(int i=1;i>=0;i++) {
            if(N!=0) {   //only enter if number >0
                int X=N%10;     // we get 5 4 3 2 1
                System.out.print(X);  //print 5 4 3 2 1
                int M=N-X;      //12340 1230 120 10 0
                N=M/10;      //1234 123 12 1 0
                // System.out.println(N);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); //Scanner class object for input
        System.out.println("Enter number to reverse it"); //message show to user
        int N=scanner.nextInt(); //Store int Type of data


        ReverseNumber1 reverseNumber=new ReverseNumber1(); //Class object
        int rev=reverseNumber.getReverseNumber(N); //Sending int value/user value to method
        System.out.println(rev);
    }
}
