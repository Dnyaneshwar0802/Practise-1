package org.ex;

import java.util.ArrayList;
import java.util.List;

/*Question 1: Sorting with ArrayList
 Task:
Create an ArrayList in Java, add a few elements to it, and then sort the list in
descending order.
o Print the original and sorted list.*/
public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> li=new ArrayList<Integer>();
        li.add(50);
        li.add(30);
        li.add(40);
        li.add(10);
        li.add(25);
        System.out.println(li);
        li.sort((a,b)->b-a);
        System.out.println("Sorted arraylist by decending order >>"+li);
    }
}
