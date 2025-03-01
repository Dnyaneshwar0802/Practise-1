package org.ex;


public class ReverseArray {
    public static void main(String[] args) {
        int a[]= { 1,3,2,3,4,5};
        //System.out.println(arr.length);
        int a1[]=new int[a.length];
        int j=0;
        //int arr1[]=new int[(arr.length-1)]; //allowed
        // System.out.println(arr1.length);
        for(int i=(a.length-1);i>=0;i--) {
            //System.out.println(arr[i]);
            a1[j]=a[i];
            j++;

        }
        for(int y=0;y<a1.length;y++) {
            System.out.println(a1[y]);
        }
    }
}
