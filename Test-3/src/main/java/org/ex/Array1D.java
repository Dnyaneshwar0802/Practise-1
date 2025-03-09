package org.ex;

public class Array1D {
    public static void main(String[] args) {
        //int a =10,20,30,40,60; thi is showing error some if we want
        // strore a data in sequence of character so use array.

        int a[]= { 34,56,78,78,89};// litrals
        int arr[] = new int[4];// new keyword
        arr[0] = 23;
        arr[1] = 23;
        arr[2] = 23;
        arr[3] = 23;
        System.out.println("Length of array >>"+a.length);
        System.out.println("Length of second array >>"+arr.length);
        for (int i = 0; i < a.length; i++) { // 0<5 1<5 2<5 3<5 4<5 5<5x
            System.out.println(a[i]); //a[0] a[1]--a[4]
        }
        for (int x : arr) { //print
            System.out.println(x);
        }
       // 0-><5 ++ //int arr x
    }
}
