package org.ex;


//WAP- copy all elements of one array into another array
public class CopyArray {
    public static void main(String[] args) {
        int arr[]=new int[] {10,20,40,60};
   /* int arr1[]=arr[]; Not allowed
    int arr1[];
    int arr1[] = null;
    for(int i=0;i<arr.length;i++) {
    	arr1[i]=arr[i];

    }
    for(int i=0;i<arr1.length;i++) {
    	System.out.println(arr1[i]);
    }
    */
        //? NOT ALLOWED ABOVE GIVE ECXEPTION
        //Exception in thread "main" java.lang.NullPointerException
        //at com.practise.CopyArray.main(CopyArray.java:10)
        int arr1[]=new int[4];
        //Create array size of same or big/small ok
        for(int i=0;i<arr.length;i++) {
            arr1[i]=arr[i];

        }
        for(int i=0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }
    }

}
