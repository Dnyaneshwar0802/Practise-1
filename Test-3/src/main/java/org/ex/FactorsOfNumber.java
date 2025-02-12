package org.ex;
import java.util.Scanner;
public class FactorsOfNumber {
     void factors(int no) {
            for(int i=1;i<=no;i++) {
                if(no%i==0) {
                    System.out.print(i+",");
                }
            }
        }
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter Number which you want  factors");
            int num=scanner.nextInt();
            FactorsOfNumber factorsOfNumber=new FactorsOfNumber();
            factorsOfNumber.factors(num);
        }
    }
