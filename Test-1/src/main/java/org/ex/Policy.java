package org.ex;


import java.util.Scanner;

public class Policy {
    int policyId;
    String policyName;
    String policyType;
    int premiumAmmount;

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public void setPremiumAmmount(int premiumAmmount) {
        this.premiumAmmount = premiumAmmount;
    }

    //Return policy object Method
    public Policy getPolicyDetails() {
        Policy p=new Policy();
        //int x=p.policyId;
        @SuppressWarnings("resource")
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter ID int");
        int id=scanner.nextInt();
        p.setPolicyId(id);
        System.out.println("Enter Policy Name String");
        String pName=scanner.next();
        p.setPolicyName(pName);
        System.out.println("Enter policy type String");
        String pType=scanner.next();
        p.setPolicyType(pType);
        System.out.println("Enter policy Ammount int");
        int pAmmount=scanner.nextInt();
        p.setPremiumAmmount(pAmmount);
        return p;
    }
    @Override
    public String toString() {
        return "Policy Class toString>> policyId=  "+policyId+"  policyName= "+policyName+
                "  policyType=  " +policyType+"  premiumAmmount=  "+premiumAmmount;
    }
    public static void main(String[] args) {
        Policy p1=new Policy();
        Policy p2=p1.getPolicyDetails();
        System.out.println(p2);
        //Before toString op=com.firstquestion.solve.Policy@42a57993
    }
}

