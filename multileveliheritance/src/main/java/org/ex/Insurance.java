package org.ex;

import java.util.Scanner;

public class Insurance {
    int id;
    String personName;
    String insuranceCompany;

    void getInsuranceDetails() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter ID>>");
        id=scanner.nextInt();
        System.out.println("Enter your name");
        personName=scanner.next();
        System.out.println("Insurance company name");
        insuranceCompany=scanner.next();
    }
    void getInsuranceInformation() {
        System.out.println("Id is >>"+id);
        System.out.println("Account Name>>"+personName);
        System.out.println("Insurance company >>"+insuranceCompany);
    }

}
