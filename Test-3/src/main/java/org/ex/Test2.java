package org.ex;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Enter Name and DOB");
        Scanner sc = new Scanner(System.in);
        String inpStr = sc.nextLine().toLowerCase();
        List<Character> li=new ArrayList<>();
        for(int i=0;i<inpStr.length();i++){
            if(inpStr.charAt(i)==' '){
                continue;
            }
         if(li.contains(inpStr.charAt(i))){
             System.out.println("Alredy Char is Present");
         }else
         {
             li.add(inpStr.charAt(i));
         }
        }
        System.out.println("String of NON Repeated"+li);
        System.out.println("Printing By HAshSET >>>");
     // char[] ch=  inpStr.toCharArray();
      Set<Character> set=new LinkedHashSet<>();
   for(int i=0;i<inpStr.length();i++){
       set.add(inpStr.charAt(i));
   }
        System.out.println("NON-Repeated String >>"+set);
    }
}
