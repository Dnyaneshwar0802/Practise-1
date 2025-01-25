package org.ex;


public class MethodStudentName {
    String getStudentName(String name) {
        return name; //(String name) that's why no need ""
    }

    public static void main(String[] args) {
        //Create object of class
        MethodStudentName methodStudentName = new MethodStudentName();
        //Store value for String
        String Str = methodStudentName.getStudentName("Raviraj");
        System.out.println("Student name is== " + Str);
    }
}
