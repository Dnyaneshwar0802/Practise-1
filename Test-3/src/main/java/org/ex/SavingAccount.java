package org.ex;


import java.util.Scanner;

public class SavingAccount extends Account {
    String accountType;
    long balance;

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    void getSavingAccountDetails() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saving account Type");
        String abc=scanner.next();
        System.out.println("Saving account balance");
        long l=scanner.nextLong();
        setAccountType(abc);
        setBalance(l);
        //getAccountDetails(); calling method from class 1
        getSavingAccountInformation();
    }

    void getSavingAccountInformation() {
        System.out.println("Child class Account Type"+accountType);
        System.out.println("Child class Account Balance"+balance);
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.getAccountDetails();
        sa.getSavingAccountDetails();
    }
}

