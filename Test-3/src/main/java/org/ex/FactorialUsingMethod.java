package org.ex;

/*4. Design method int fact orial(int no)  which returns int value to that method.
 *  print the results into main method (Example enter no as 5,
 *  factorial means 5*4*3*2*1 then output is 120)*/
public class FactorialUsingMethod {
    int factorial(int no) {
        int fact = 1;
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        FactorialUsingMethod factorialUsingMethod = new FactorialUsingMethod();
        int n = factorialUsingMethod.factorial(5);
        System.out.println(n);
    }
}

