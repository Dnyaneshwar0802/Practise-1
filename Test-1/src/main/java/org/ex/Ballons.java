package org.ex;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Ballons {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        al.add("Red");
        al.add("Blue");
        al.add("Red");
        al.add("Blue");
        al.add("Green");
        Set<String> set=new LinkedHashSet<String>(al);
        System.out.println(set);
    }
}
