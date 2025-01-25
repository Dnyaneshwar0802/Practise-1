package org.ex;


public class Addition {

    int add(int x,int y) { //passing argument

        int sum=x+y;
        return sum;
    }
    int sum()
    {
        int a=5;
        int b=10;
        int Add=a+b;
        return Add;

    }
    static void Add() {
        int x=20;
        int y=30;
        System.out.println("Addition=="+(x+y));
    }
    public static void main(String[] args) {
        Addition addition=new Addition();
        int A=addition.add(10, 30);
        System.out.println("Addition is =="+A);
        //Not passing parameters
        int b=addition.sum();
        System.out.println("sum is =="+b);
        Add();
    }
}

