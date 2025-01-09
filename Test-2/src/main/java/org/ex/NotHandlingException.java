package org.ex;

public class NotHandlingException {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try Block");
            System.out.println(10/0);
        }finally {
            System.out.println("We didnt handled exception");
        }
    }
}
