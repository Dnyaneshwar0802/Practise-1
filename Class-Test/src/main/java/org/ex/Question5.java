package org.ex;

public class Question5 {
    public static void main(String[] args) {
        int[] arr={10,30,40,60,90};
        try {
            System.out.println(arr[arr.length]);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
