package org.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" enter the rows number ");
            int row = sc.nextInt();
            System.out.println("Enter the colun number");
            int column = sc.nextInt();

            int arr[][] = new int[row][column];

            for (int i = 0; i < row; i++) { //0<2
                for (int j = 0; j < column; j++) { //0<3 1<3
                    System.out.println("Enter the value of "+i+","+j);
                    arr[i][j]=sc.nextInt();
                }
            }
       // System.out.println(Arrays.toString(arr));
        //Printing 2D array
        for (int i = 0; i < row; i++) { 
            for (int j = 0; j < column; j++) {
                System.out.println(arr[i][j]);
            }
        }



    }
}
