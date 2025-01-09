package org.ex;

public class ArrayExceptionCode {
    public static void main(String[] args) {
        int arr[] = {20, 30, 40};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
