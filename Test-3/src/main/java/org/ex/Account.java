package org.ex;

import java.util.Scanner;

public class Account {
    int accountNumber;
    String accountName;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    void getAccountDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int num = scanner.nextInt();
        System.out.println("Enter Account Name");
        String name = scanner.next();
        setAccountNumber(num);
        setAccountName(name);
        getAccountInformation();
    }

    void getAccountInformation() {
        System.out.println("AccountNumber >>" + accountNumber);
        System.out.println("Account Name>>" + accountName);
    }
}

