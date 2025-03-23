package org.ex;

import java.util.*;

public class ListEvenOdd {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(20);
        li.add(35);
        li.add(45);
        li.add(88);
        li.add(20);
        li.add(50);
        System.out.println("This is List"+li);
    /*    for(int i=0;i<li.size();i++){
            if(li.get(i)%2==0)
            System.out.println(li.get(i));
        }*/
       // li.stream().map(a->a%2).forEach(x-> System.out.println(x));
        Set<Integer> set=new HashSet<>(li);
        System.out.println("This is Hashset"+set);
        Set<Integer> liset=new LinkedHashSet<>(li);
        System.out.println("This is Linked HashSet"+liset);

    }
}
