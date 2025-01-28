package org.ex;

//7.  Write the program to print the square of any number.

public class SquareOfNumber {
    //Square means 2*2=4 i.e.(x*x)
//method creating for square
    int sq(int x) {
        int square=x*x;
        return square;
    }
    public static void main(String[] args) {
        int num1=9;
        int square =num1*num1; //direct doing square
        System.out.println("Square of number is =="+square);
        //calling Non-static method/instance method need to create object
        SquareOfNumber squareOfNumber=new SquareOfNumber();
        int i=squareOfNumber.sq(11);
        System.out.println("Method calling Suqare is "+i);
    }

}

