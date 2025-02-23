package org.ex;


import java.util.Scanner;
public class LifeInsurance extends Insurance {
    int premiumAmmount;
    void getLifeInsuranceDetails() {
        getInsuranceDetails();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Permium Ammount");
        premiumAmmount=scanner.nextInt();
    }
    void getLifeInsuranceInformation(){
        getInsuranceInformation();
        System.out.println("Premium Ammount is >>"+premiumAmmount);
    }

}

