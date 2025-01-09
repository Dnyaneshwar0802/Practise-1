package org.ex;

public class ArithmaticExceptionCode {
    public static void main(String[] args) {
        int num1=10;
        int num2=0;
        try{
            int sum=num1/num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
