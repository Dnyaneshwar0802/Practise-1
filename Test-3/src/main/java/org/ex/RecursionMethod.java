package org.ex;

public class RecursionMethod {
    static void repeatcalling() { //method calling itself is recursion
        System.out.println("Sequance printing...");
        repeatcalling();//calling method in method recursion infinite
    }
    public static void main(String[] args) {
        repeatcalling();
    }
}

