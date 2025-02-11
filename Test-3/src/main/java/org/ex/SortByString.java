

package org.ex;

import java.util.ArrayList;
import java.util.List;

public class SortByString {
    public static void main(String[] args) {
        List<String> listOfString =new ArrayList<String>();
        listOfString.add("Dnyaneshwar");
        listOfString.add("krishna");
        listOfString.add("Rohan");
        listOfString.add("Ajay");
        listOfString.add("Yogesh");
        listOfString.stream().map(x->x.toLowerCase()).sorted((a,b)->b.compareTo(a))
                .forEach(x-> System.out.println("Sorter By Ascending Order >>>"+x));
    }
}