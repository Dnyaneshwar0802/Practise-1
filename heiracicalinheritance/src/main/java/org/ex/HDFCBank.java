package org.ex;

import java.util.Scanner;

public class HDFCBank extends Bank {
    void getHdfcBankDetails() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter principal Amount");
        principleAmount=scanner.nextDouble();
        System.out.println("Enter time you want to check");
        tenure=scanner.nextInt();
        System.out.println("Enter rate of intrest");
        rateOfInterest=scanner.nextFloat();
        double Ans=getCalculateInterest(principleAmount, tenure, rateOfInterest);
        System.out.println(Ans);

    }

    double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {

        return (principleAmount*tenure*rateOfInterest)/100;
    }
    public static void main(String[] args) {
        HDFCBank hdfcBank=new HDFCBank();
        hdfcBank.getHdfcBankDetails();
    }
}

