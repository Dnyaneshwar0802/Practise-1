package org.ex;

import java.util.Scanner;
public class ArmStrongNumber {
    void inputOutput() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value");
        int N=scanner.nextInt();
        checkNumber(N);
    }
    void checkNumber(int n) {
        int result = 0;
        int c = 0;
        for (int j = 1; j>= 1; j++) {
            if (n > 0) {
                int x = n % 10; // 153-- 3 5 1
                //System.out.println(x);
                c = x * x * x; // 3cube 5^3 1^1
                //System.out.println(c);
                n = n / 10; // 15 1
                //System.out.println(n);

                result = c + result; // 0+3^3-- 3^3+5^3 --
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        ArmStrongNumber armStrongNumber = new ArmStrongNumber();
        armStrongNumber.inputOutput();
    }
}

