package org.ex;

import java.util.Scanner;

public class Cube {
    public int getNumberCube(int num) { //method created
        int N;
        N=num*num*num;
        return N; //int value returned
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number ...");
        int no=scanner.nextInt();
        //creating object for class
        Cube cube=new Cube();
        //passing value to method
        int N=cube.getNumberCube(no);
        System.out.println(N);
    }

}
