package org.ex;


public class Multiplication {

    int mul(int x,int y) { //passing argument

        int m=x*y;
        return m;
    }
    int multiply()
    {
        int a=5;
        int b=10;
        int Add=a*b;
        return Add;

    }
    static void star() {
        int x=20;
        int y=30;
        System.out.println("Staruse=="+(x*y));
    }
    public static void main(String[] args) {
        Multiplication multiplication=new Multiplication();
        int A=multiplication.mul(10, 30);
        System.out.println("Multiplication is =="+A);
        //Not passing parameters
        int b=multiplication.multiply();
        System.out.println("mul is =="+b);
        star();
    }
}



