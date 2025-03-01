package org.ex;


//frequency of each element
public class FrequencyofeachArray {
    public static void main(String[] args) {
        int arr1[]= {20,60,90,80,56,56,90,90,80,90};
        int arr2[]=new int[arr1.length];
        for(int i=0;i<arr1.length;i++) {
            int count=1;
            for(int j=0;j<arr1.length;j++) {
                if(i!=j) {
                    if(arr1[i]==arr1[j]) {
                        count++;
                    }
                }

            }
            System.out.println(arr1[i]+" "+count);
        }
    }
}
