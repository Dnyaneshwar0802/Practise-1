package org.ex;
//Input- "Sagar1998"
//Output
//        Char =Sagar
//No=1998 charati>=0<=9
public class TestException {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("This Line is Before Exception");
        try{
            System.out.println("Current exception >>"+10/0);
        } catch (Exception e) {
            System.out.println("Exceprion Handles and occured by 10/0 >>");
            System.out.println(e);
        }

        System.out.println("Line After Exception");
        System.out.println("Code End");

    }
}
