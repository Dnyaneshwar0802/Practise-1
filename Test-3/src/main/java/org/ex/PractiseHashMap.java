package org.ex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PractiseHashMap {
    public static void main(String[] args) {
        Map<Employee,String> hm=new HashMap<Employee,String>();
        hm.put(new Employee(1,"Dnyae"),"Dnyaneshwar");
        hm.put(new Employee(20,"Gaju"),"Gajanan");
        hm.put(new Employee(10,"krish"),"Krishna");
        hm.entrySet().stream()
                .sorted((a,b)->a.getKey().getId()-b.getKey().getId())
                .forEach(x-> System.out.println(x));

    }
}
