package org.ex;

//4.print month of year. Case 1 January case 2 February case n....use switch case
public class MonthPrint {
    public static void main(String[] args) {
        String str="April";
        switch(str) {
            case "Jan":
                System.out.println("Month is jan");
                break;
            case "Feb":
                System.out.println("Month is Feb");
                break;
            case "March":
                System.out.println("Month is March");
                break;
            case "April":
                System.out.println("Month is April");
                break;
            case "May":
                System.out.println("Month is May");
                break;
            case "Jun":
                System.out.println("Month is Jun");
                break;
            case "July":
                System.out.println("Month is July");
                break;
            case "Aug":
                System.out.println("Month is Aug");
                break;
            case "Sept":
                System.out.println("Month is Sept");
                break;
            case "Oct":
                System.out.println("Month is Oct");
                break;
            case "Nov":
                System.out.println("Month is Nov");
                break;
            case "Dec":
                System.out.println("Month is Dec");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

