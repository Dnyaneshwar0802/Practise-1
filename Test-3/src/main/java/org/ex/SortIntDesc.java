package org.ex;

import java.util.Arrays;
import java.util.List;

public class SortIntDesc {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(10,30,20,60,50,40,99);
        li.stream().sorted((a,b)->a-b).forEach(x-> System.out.println(x));
    }
}
