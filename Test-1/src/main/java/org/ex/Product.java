package org.ex;

import java.util.Scanner;
public class Product {
    void productCheck(int weight) {
        if(weight<100) {
            throw new ProductException("Weight is Too low");
        }
        else {
            System.out.println("Weight is good you can proceed");
        }
        System.out.println("program is running");
        if(weight>200) {
            throw new ProductException();

        }
        System.out.println("After default");
    }
    public static void main(String[] args) {
	/*Product product=new Product();
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter weight");
	int N=scanner.nextInt();
	product.productCheck(N);*/
        //Above we just created Error not handled
        //let's handle
        Product product=new Product();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter weight");
        int N=scanner.nextInt();
        try {
            product.productCheck(N);
        }
        catch(Exception p){
            p.printStackTrace();
        }
        System.out.println("hello exception there");
    }
}

