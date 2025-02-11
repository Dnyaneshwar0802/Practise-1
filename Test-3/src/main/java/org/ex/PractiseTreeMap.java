package org.ex;

import java.util.*;
import java.util.stream.Collectors;

public class PractiseTreeMap {

    public static void main(String[] args) {
        TreeMap<Employee,String> tm=new TreeMap<>();
       tm.put(new Employee(1,"dny"),"Dnyaneshwar");
       tm.put(new Employee(20,"abc"),"Random_abc");
       tm.put(new Employee(10,"xyz"),"Random_xyz");
      /* @org.jetbrains.annotations.NotNull Set<Map.Entry<Employee, String>> tt =tm.entrySet().stream()
                       .sorted((a,b)->a.getKey().getId()-a.getKey().getId())
               .collect(Collectors.toSet());*/
       
     //  Collections.sort(tm,(a,b)->);

    }
}
