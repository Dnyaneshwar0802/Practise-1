package org.ex;

import java.util.Scanner;
public class Termpolicy extends LifeInsurance {
    int duration;

    void getTermPolicyDetails() {
        getLifeInsuranceDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Duration");
        duration=scanner.nextInt();

    }

    void getTermPolicyInformation() {
        getLifeInsuranceInformation();
        System.out.println("Duration is "+duration);
    }
    public static void main(String[] args) {
        Termpolicy termpolicy=new Termpolicy();
        termpolicy.getTermPolicyDetails();
        termpolicy.getTermPolicyInformation();
    }
}

