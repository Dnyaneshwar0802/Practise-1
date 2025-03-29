package org.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Enter Name and DOB");
        Scanner sc = new Scanner(System.in);
        String inpStr = sc.next();
        List<Character> dob=new ArrayList<>();
        List<Character> name=new ArrayList<>();
        for (int i = 0; i < inpStr.length(); i++) {
            if (inpStr.charAt(i) == '0' || inpStr.charAt(i) == '1' || inpStr.charAt(i) == '2' || inpStr.charAt(i) == '3' || inpStr.charAt(i) == '4' || inpStr.charAt(i) == '5' || inpStr.charAt(i) == '6' || inpStr.charAt(i) == '7' || inpStr.charAt(i) == '8' || inpStr.charAt(i) == '9') {
                dob.add(inpStr.charAt(i));
} else {
                name.add(inpStr.charAt(i));
            }
        }
        System.out.println("Name is >>" + name);
        System.out.println();
        System.out.println("DOB is >>" + dob);
    }
}
