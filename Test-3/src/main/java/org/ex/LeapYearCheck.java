package org.ex;

//2.write a program  to check whether  year is leap year or not. (If else stmt).

public class LeapYearCheck {
    public static void main(String[] args) {
        int yr=1997;
        if(yr%4==0) {
            System.out.println("Year is leap");
        }
        else {
            System.out.println("Year is not leap");
        }
    }
}

