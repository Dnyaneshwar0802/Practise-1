package org.ex;

import java.util.ArrayList;
import java.util.List;

public class ListEvenOdd {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<>();
        li.add(20);
        li.add(35);
        li.add(45);
        li.add(88);
        li.add(20);
        li.add(50);
        for(int i=0;i<li.size();i++){
            if(li.get(i)%2==0)
            System.out.println(li.get(i));
        }
       // li.stream().map(a->a%2).forEach(x-> System.out.println(x));
    }
}
